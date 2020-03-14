package mavendemo.loginex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = req.getParameter("uname");
		if(uname.equals("Vishnu") && req.getParameter("pwd").equals("password")){
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			resp.sendRedirect("welcome.jsp");
			System.out.println("If -- Git edit");
		}
		else {
			resp.getWriter().println("Invalid Credentials");
			resp.sendRedirect("login.jsp");
			System.out.println("else --Git Edit");
			System.out.println("Test-Local");
		}
	}
}
