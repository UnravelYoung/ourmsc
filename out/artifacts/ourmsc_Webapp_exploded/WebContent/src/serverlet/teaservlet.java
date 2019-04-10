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
import serverice.teaservice;
import serverice.impl.stuaddserviceimpl;
import serverice.impl.studelserviceimpl;
import serverice.impl.teaserviceimpl;

/**
 * Servlet implementation class teaservlet
 */
@WebServlet("/teaservlet")
public class teaservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */                                     
    public teaservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		String flag=req.getParameter("flag");
		if("new".equals(flag)){
			System.out.println("³É¹¦£¡");
			inserttea(req,resp);
		}else if("update".equals(flag)){
			this.updatetea(req,resp);
		}else if("delete".equals(flag)){
			System.out.println("success");
			deltea(req,resp);
		}else if("select".equals(flag)){
			
		}
	}
	
	private void inserttea(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException{
		
		int tid=Integer.parseInt(request.getParameter("tid"));
		String tname=(request.getParameter("tname"));
		String tcode=(request.getParameter("tcode"));
		teaservice ss=new teaserviceimpl();
		String result=ss.inserttea(tid, tname,tcode);
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
	
	private void deltea(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException{
		int tid=Integer.parseInt(request.getParameter("tid"));
		teaservice ss=new teaserviceimpl();
		String result=ss.deltea(tid);
		PrintWriter out=resp.getWriter();
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
	
	public void updatetea(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException{
		int tid=Integer.parseInt(req.getParameter("sid"));
		String tname=(req.getParameter("tname"));
		String scode=(req.getParameter("tcode"));
		PrintWriter out=resp.getWriter();
		teaservice ss=new teaserviceimpl();
	    String result=ss.updatetea(tid, tname,scode);
		if(result.equals("success")){
			
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>ÐÞ¸Ä³É¹¦£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}else if(result.equals("Error")){
			out.println("<HTML>");
			out.println("<HEAD><title>A Servlet</title></head>");
			out.println("<body bgcolor=#8dd8f8>");
			out.println("<img src=image/t.png><font size=6 color=red>ÐÞ¸ÄÊ§°Ü£¡</font>");
			out.println("</body>");
			out.println("</HTML>");
			
		}
	}

}
