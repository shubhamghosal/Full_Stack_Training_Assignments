package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.BankUser;
import com.app.service.IUserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	//dependency : service layer i/f
	@Autowired
	private IUserService userService;
	
	public AdminController() {
		System.out.println("In def constr : "+getClass().getName());
	}
		
	@GetMapping("/list")
	public String showList(Model map) {
		List<BankUser> allUsers = userService.getAllUsers();
		System.out.println(allUsers);
		
		map.addAttribute("users", allUsers); //RedirectAttributes flashMap is not working here : its only working after redirect
		return "/admin/list";
	}

	
	//add req handling method : for showing vendor reg form
	@GetMapping("/add")
	public String showAddNewVendorForm(BankUser user) { //POJO to form data binding : SC creates vendor instance using def constr and it will add POJO in model map

		System.out.println("In showAddNewVendorForm..."+user);
		return "/admin/add"; //logical view name
		//actual view name : /WEB-INF/views/admin/add.jsp
	}
	
	//add req handling method : for processing vendor reg form
	@PostMapping("/add")
	public String processAddVendorForm(BankUser userDetails, RedirectAttributes flashMap) { //Form data to POJO binding
		System.out.println("In processAddVendorForm..."+userDetails); //populated POJO bound with form data
		//call service layer method
		flashMap.addFlashAttribute("message", userService.addUser(userDetails));
		return "redirect:/admin/list";
	}
	
}
