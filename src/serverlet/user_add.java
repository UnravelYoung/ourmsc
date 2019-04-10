package serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import serverice.impl.add_user_service;
import serverice.add_user_servicee;

@WebServlet("/user_add")
public class user_add extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public user_add() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String flag=req.getParameter("flag");
        if("new".equals(flag)){
            System.out.println("成功！");
            adduser(req,resp);
        }
    }

    private void adduser(HttpServletRequest request, HttpServletResponse resp)
            throws ServletException, IOException{
        int userid=Integer.parseInt(request.getParameter("userid"));
        String username=String.valueOf(request.getParameter("username"));
        String usermajor=String.valueOf(request.getParameter("usermajor"));
        String usercode=String.valueOf(request.getParameter("usercode"));
        add_user_servicee ss = new add_user_service();

        String result=ss.adduser(userid,username,usercode,usermajor);
        PrintWriter out=resp.getWriter();
        if(result.equals("success")){
            out.println("<HTML>");
            out.println("<HEAD><title>A Servlet</title></head>");
            out.println("<body bgcolor=#8dd8f8>");
            out.println("<img src=image/t.png><font size=6 color=red>注册成功！</font>");
            out.println("</body>");
            out.println("<br />");
            out.println("<br />");
            out.println("<br />");
            out.println("<br />");
            out.println("<br />");
            out.println("<a href=\"login.jsp\"><input type=\"submit\" value=\"登陆系统\"></a>");
            out.println("</HTML>");

        }else if(result.equals("Error")){
            out.println("<HTML>");
            out.println("<HEAD><title>A Servlet</title></head>");
            out.println("<body bgcolor=#8dd8f8>");
            out.println("<img src=image/t.png><font size=6 color=red>添加失败！</font>");
            out.println("</body>");
            out.println("</HTML>");

        }
    }

}
