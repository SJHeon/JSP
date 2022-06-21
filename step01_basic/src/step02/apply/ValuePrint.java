package step02.apply;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class ValuePrint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValuePrint() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String[] like = request.getParameterValues("like");
		
		PrintWriter out = response.getWriter();
		for (String value : like) {
			System.out.println(value);
		}
		out.println(Arrays.toString(like));
		
	}

}
