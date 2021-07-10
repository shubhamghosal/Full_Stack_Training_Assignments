package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//Populates map
//key : /first (url -pattern)
//value : F.Q servlet cls name (pages.FirstServlet)
@WebServlet(urlPatterns =  {"/first","/abc","/xyz"})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		System.out.println("in init "+Thread.currentThread());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy "+Thread.currentThread());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do-get "+Thread.currentThread());
		//set resp cont type
		response.setContentType("text/html");
		//attach PW to send resp to the clnt : resp.getWriter()
		try(PrintWriter pw=response.getWriter())
		{
			pw.print("Hello from 1st servlet....@"+LocalDateTime.now());
		}
	}

}
