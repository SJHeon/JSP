package step02.apply;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
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
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       System.out.println("get");
       request.setCharacterEncoding("UTF-8");
       
       System.out.println(request.getQueryString());
       System.out.println(URLDecoder.decode(request.getQueryString(),("utf-8")));
    }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("post");
      request.setCharacterEncoding("UTF-8");
      
      ServletInputStream input = request.getInputStream();
//      System.out.println(input);
      int length = request.getContentLength();
      byte[] data = new byte[length];
      input.readLine(data, 0, length);
      //post방식으로 넘어온 request 객체의 body정보
      String str = new String(data);
      System.out.println(str);
      System.out.println(URLDecoder.decode(str, "UTF-8"));
   }
   
   protected void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
      request.setCharacterEncoding("UTF-8");
      
//      response.setCharacterEncoding("UTF-8");
//      response.setContentType("text/html; charset=UTF-8");
//      PrintWriter out = response.getWriter();
      
//      String[] like = request.getParameterValues("like");
      
//      for(int i = 0; i < like.length; i++) {
//         out.println("<html>");
//         out.println("<head>");
//         out.println("</head>");
//         out.println("<body>");
//         out.println("<h2>가장좋아하는 것입니다</h2>");
//         out.println("뭘까요" + like[i]);
//         out.println("</body>");
//         out.println("</html>");
//         System.out.println(like[i]);
//      }
      
   }
}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
//		
//		System.out.println(request.getQueryString()); //get?
//		
//		
//		String[] like = request.getParameterValues("like"); // 여러게 가져오기
//		
//		PrintWriter out = response.getWriter();
//		for (String value : like) {
//			System.out.println(value);
//		}
//		out.println(Arrays.toString(like));
//		
//	}
