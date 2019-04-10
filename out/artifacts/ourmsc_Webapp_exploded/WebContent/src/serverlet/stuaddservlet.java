package serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serverice.stuaddservice;
import serverice.studelservice;
import serverice.impl.stuaddserviceimpl;
import serverice.impl.studelserviceimpl;


@WebServlet("/stuaddservlet")
public class stuaddservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stuaddservlet() {
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
			System.out.println("³É¹¦£¡");
			insertstudent(req,resp);
		}else if("update".equals(flag)){
			this.updatestu(req,resp);
		}else if("delete".equals(flag)){
			System.out.println("success");
			delstudent(req,resp);
		}else if("selsct".equals(flag)){
			
		}
	}

	private void insertstudent(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException{
		
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=(request.getParameter("sname"));
		String smajor=(request.getParameter("smajor"));
		String sclass=(request.getParameter("sclass"));
		String scode=(request.getParameter("scode"));
		stuaddservice ss=new stuaddserviceimpl();
		String result=ss.insertstudent(sid, sname, smajor, sclass, scode);
		PrintWriter out=resp.getWriter();
		if(result.equals("success")){
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>Ìí¼Ó³É¹¦£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}else if(result.equals("Error")){
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>Ìí¼ÓÊ§°Ü£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}
	}
	
	private void delstudent(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException{
		int sid=Integer.parseInt(request.getParameter("sid"));
		studelservice ss=new studelserviceimpl();
		String result=ss.delstudent(sid);
		PrintWriter out=resp.getWriter();
		System.out.println("success");
		if(result.equals("success")){
			
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>É¾³ý³É¹¦£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}else if(result.equals("Error")){
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>É¾³ýÊ§°Ü£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}
	}
	
	public void updatestu(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException{
		int sid=Integer.parseInt(req.getParameter("sid"));
		String sname=(req.getParameter("sname"));
		String smajor=(req.getParameter("smajor"));
		String sclass=(req.getParameter("sclass"));
		String scode=(req.getParameter("scode"));
		PrintWriter out=resp.getWriter();
		stuaddservice ss=new stuaddserviceimpl();
	    String result=ss.stuupdate(sid, sname, smajor, sclass, scode);
		if(result.equals("success")){
			
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>É¾³ý³É¹¦£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}else if(result.equals("Error")){
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>É¾³ýÊ§°Ü£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}
	}
}
