package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class IdCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public IdCheck() {
    }

    // id값이 busan이라고 한다면 -> /valid 매핑 되어 있는 servlet 화면이동
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String uname = request.getParameter("uname");
		String psw = request.getParameter("uname");
		
		if ("busan".equals(uname)) {
			// /valid 매핑 되어 있는 servlet 화면 이동
			//
//			response.sendRedirect("valid");
			request.getRequestDispatcher("valid").forward(request, response);
		} else {
//			request.getRequestDispatcher("valid2").forward(request, response);
			response.sendRedirect("invalid");
		}
		
	}

}
