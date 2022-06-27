package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate2
 */
@WebServlet("/valid2")
public class Validate2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Validate2() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print(request.getParameter("uname") + "는 등록되지 않은 아이디 입니다.");
		out.close();
	}

}
