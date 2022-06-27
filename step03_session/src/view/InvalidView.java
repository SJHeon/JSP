package view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/invalid")
public class InvalidView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InvalidView() {
        super();
    }

    // SessionFinal 로그아웃 버튼을 클릭 했을 때 -> 현재의 Servlet에서 세션 무효화(종료)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("lecture"));
		session.invalidate();
		session = null; // invalidate했을 때 session이 메모리에서 완전하게 안내려 갔을 수 도 있음!
//		System.out.println(session.getAttribute("lecture"));
		
		response.sendRedirect("login.html");
	}

}
