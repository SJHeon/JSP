package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "var", urlPatterns = "/var")
public class Variable extends HttpServlet {
   private static final long serialVersionUID = 1L;
     
    public Variable() {
    }
    
    String msg;
    
    // 프로젝트 /var?msg=""
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int number = 0;
      msg = request.getParameter("msg");
      
      response.setContentType("text/html; charset = UTF-8");
      
      PrintWriter out = response.getWriter();
      
      out.println("<html><head>Variable Test</head>");
      out.println("<body><h2>Result</h2>");
      while(number++ < 10) {
         out.print(msg + " : " + number + "</br>");
         out.flush();
         System.out.println(msg + " : " + number);
         
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      out.println("</body></html>");
      out.close();
   }

}