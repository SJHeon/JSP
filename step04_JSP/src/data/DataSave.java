package data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class DataSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataSave() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// cookie 생성 -> jsp02_EL.jsp
		Cookie cookie = new Cookie("id", "busan");
		cookie.setMaxAge(60 * 60 * 24 * 360);
		response.addCookie(cookie);
		
		response.sendRedirect("jsp02_EL.jsp");
	}

}
