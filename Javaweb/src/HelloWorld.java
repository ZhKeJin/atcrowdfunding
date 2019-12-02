import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author Zhangkj
 * @date 2019-04-17-20:03
 */
public class HelloWorld extends HttpServlet {

  //  private Student student ;
    public void service(HttpServletRequest req, HttpServletResponse resp) {


        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
            String username = req.getParameter("stuID");
            String password = req.getParameter("pwd");




            System.out.println("接受请求");
            System.out.println(username + " ...." + password);




        Student student = new Student(12, "zhangsan", "123456");

        String str = "{'age':'asdf','name':'zhangsan','password':'123456'}";







        try {
            resp.getWriter().println(str);



        } catch (IOException e) {
            e.printStackTrace();
        }
        //  resp.sendRedirect(req.getContextPath()+"/a.jsp");


    }
}
