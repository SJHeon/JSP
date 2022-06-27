package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Final() {
        super();
    }
    
    // Client에 있는 Cookie 정보 획득 - 해당 서비스에서 발생시킨 쿠키 정보에 한해서만 획득
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// myId, myAge, myName 으로 지정되어 있는 모든 쿠키 출력
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// myID, myAge, myName 으로 지정되어 있는 모든 쿠키 출력
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie);
			System.out.println(cookie.getValue());
			out.println(cookie.getName()+ " : " +cookie.getValue()+"<br/>");
		}
		
		// myName에 대한 쿠키만 삭제?
		Cookie deleteMyName = new Cookie("myName", null);
		deleteMyName.setMaxAge(0);
		response.addCookie(deleteMyName); // Client를 통해서 최종적으로 변경
		out.println("delete myName");
		
	}

}
