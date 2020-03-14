package mavendemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mavendemo.model.AlienDao;
import mavendemo.pojo.Alien;

@WebServlet("/alien-servlet")
public class ALienServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Alien a = AlienDao.getAlien(Integer.parseInt(req.getParameter("id")));
		
		req.setAttribute("alien", a);
		
		RequestDispatcher rd = req.getRequestDispatcher("alien.jsp");
		rd.forward(req, resp);
	}

}
