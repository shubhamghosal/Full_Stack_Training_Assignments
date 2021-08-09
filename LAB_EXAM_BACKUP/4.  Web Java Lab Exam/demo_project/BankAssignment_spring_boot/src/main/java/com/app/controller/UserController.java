package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Accounts;
import com.app.pojos.BankUser;
import com.app.pojos.Role;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	// userctrler dependent on service layer i/f
	@Autowired
	private IUserService userService;

	// Spring bean is : located loaded and instantiated in def constructor
	public UserController() {
		System.out.println("In def constr : " + getClass().getName() + " : " + userService);
	}

	// add request handling method for showing login form (show form phase)
	// key in HandlerMappingBean : /user/login , method=GET
	// value : com.app.controller.UserController.showLoginForm()
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("In show login form...");

		return "/user/login"; // logical view name
		// actual view name : /WEB-INF/views/user/login.jsp;
	}

	// add request handling method for process login form (process form phase)
	// key in HandlerMappingBean : /user/login , method=POST
	// value : com.app.controller.UserController.processLoginForm(dependency list)
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam(name = "password") String pwd, Model map,
			HttpSession session) { // here Model and HttpSession are dependencies provided by SC
		// minimum scope of Model = request, minimum scope of HttpSession = session

		// Model map : request scope only
		// Http session : sessionScope (from user login to logout)

		System.out.println("In process login form..." + email + pwd);
		try {
			// invoke service layer method
			BankUser validatedUser = userService.validateUser(email, pwd);
			// valid login : add validated user details under model map(saved in request
			// scope)
			session.setAttribute("user_details", validatedUser);
			session.setAttribute("message", validatedUser.getName() + " login successful");
			// check user role

			if (validatedUser.getRole().equals(Role.ADMIN))
				return "redirect:/admin/add";

			else {
				List<Accounts> allAccounts = validatedUser.getAccounts();
				System.out.println(allAccounts);
				map.addAttribute("accounts", allAccounts);
				return "redirect:/user/accountSummary";
			}

		} catch (RuntimeException e) {
			e.printStackTrace();
			// invalid login : forward client to login.jsp
			map.addAttribute("message", "Invalid login...");
			return "/user/login"; // logical view name
			// actual view name : /WEB-INF/views/user/login.jsp
		}
	}

	// add new request handling method for logging out user
	@GetMapping("/logout")
	public String userLogout(HttpSession session, Model map, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("In user logout");

		// access user details from sessionScope and add them in Model map
		map.addAttribute("details", session.getAttribute("user_details"));

		// redirect user to home page automatically after 5 secs
		// context-path = spring-mvc-boot (set in application.properties)
		response.setHeader("refresh", "5;url=" + request.getContextPath());

		// discard session
		session.invalidate();

		return "/user/logout"; // logical view name
		// actual view name : WEB-INF/views/user/logout.jsp
	}

	@GetMapping("/accountSummary")
	public String showAccountSummary(Model map, HttpSession session) {

		BankUser user = (BankUser) session.getAttribute("user_details");
		if (user == null) {
			session.invalidate();
			return "redirect:/user/login";
		}

		map.addAttribute("accounts", user.getAccounts());
		return "/user/accountSummary";
	}

	@GetMapping("/createAccount")
	public String showCreateAccount(Accounts account, HttpSession session) {

		BankUser user = (BankUser) session.getAttribute("user_details");
		if (user == null) {
			session.invalidate();
			return "redirect:/user/login";
		}

		account.setBalance(0.0);
		System.out.println("in showCreateAccount");
		return "/user/createAccount";
	}

	@PostMapping("/createAccount")
	public String createAccount(Accounts account, RedirectAttributes flashMap, HttpSession session) {

		BankUser user = (BankUser) session.getAttribute("user_details");
		if (user == null) {
			session.invalidate();
			return "redirect:/user/login";
		}

		String mseg = userService.addAccount(account, user);
		flashMap.addFlashAttribute("message", mseg);
		System.out.println("in createAccount acct =" + account);
		return "redirect:/user/accountSummary";
	}

	@PostMapping("/transaction")
	public String processTransaction(@RequestParam Double amt, @RequestParam Integer bid, HttpSession session,
			@RequestParam String transaction, RedirectAttributes flashAttributes) {
		System.out.println("Amount : " + amt);

		BankUser user = (BankUser) session.getAttribute("user_details");

		System.out.println(transaction);

		if (transaction.equals("Withdraw Amount")) {
			String withdrawAmount = userService.withdrawAmount(user, bid, amt);
			flashAttributes.addFlashAttribute("message", withdrawAmount);
		} else if (transaction.equals("Deposit Amount")) {
			String depositAmount = userService.depositAmount(user, bid, amt);
			flashAttributes.addFlashAttribute("message", depositAmount);
		}

		
		
		/*
		 * //retrive user from session BankUser user =
		 * (BankUser)session.getAttribute("user_details");
		 * 
		 * System.out.println(request.getAttribute("withdraw"));
		 * 
		 * 
		 * if(request.getAttribute("withdraw")!= null) {
		 * 
		 * //pass user id ,bank id and amount to dao layer
		 * userService.withdrawAmount(user.getId(),bid,amt);
		 * 
		 * } else if(request.getAttribute("deposit")!= null) {
		 * userService.depositAmount(user.getId(),bid,amt); }
		 */
		return "redirect:/user/accountSummary";
	}

}
