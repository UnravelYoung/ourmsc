package serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import po.user;
import serverice.impl.userviceimpl;

/**
 * Servlet implementation class loginserverlet
 */
@WebServlet("/login")
public class loginserverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	userviceimpl us=new userviceimpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginserverlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//this.doPost(req, resp);
		
		String fl=req.getParameter("flag");
		if("login".equals(fl)){
			this.login(req, resp);
		}else if("logout".equals(fl))
			{
			this.logout(req, resp);
		}else System.out.println("找不到请求的路径！");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);

	}

	private void login(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException{
		int userid=Integer.parseInt(req.getParameter("userid"));
		String password=(req.getParameter("password"));
		String role=(req.getParameter("role"));
		user use=us.login(userid, password, role);
		if(use!=null){
			HttpSession session=req.getSession();
			session.setAttribute("id",userid);
			session.setAttribute("name",use.getUsername());
			session.setAttribute("kind",role);
			req.getRequestDispatcher("admin_frame.jsp").forward(req,resp);

		}else{
			resp.setContentType("text/html");
			resp.setCharacterEncoding("utf-8");
			resp.setHeader("refresh","2;URL=login.jsp");
			PrintWriter out=resp.getWriter();
			out.print("<font size=5 color=red>用户");
			out.print(userid);
			out.print("用户名或密码错误或用户身份错误！！2s后自动跳转到登陆界面……</font>");

		}
		
	}

	
	@SuppressWarnings("unused")
	private void logout(HttpServletRequest req,HttpServletResponse resp) 
			throws ServletException, IOException{
		HttpSession session = req.getSession();
		System.out.println("++++++");
		req.removeAttribute("id");
		req.removeAttribute("name");
		req.removeAttribute("kind");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	

	

}
