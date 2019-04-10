<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="po.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <jsp:useBean id="sdao" scope="page" class="dao.impl.studentDaoimpl"></jsp:useBean>
    <title></title>
    </head>
  
  <body bgcolor="#8dd8f8">
    <%
    request.setCharacterEncoding("UTF-8");
    int sid=Integer.parseInt(request.getParameter("sid")) ;
    String sclass=request.getParameter("sclass");
    String smajor=request.getParameter("smajor");
    
    List list=sdao.select(sid,sclass,smajor);
    int i=list.size();
    Student stu[]=new Student[i];
    
     %>
     <div align="center"><font size="5" color="#000080" face="华文楷体"><b>学生信息如下：<br><br></b></font></div>
     <table border="1" cellspacing="0" cellpadding="0" align="center">
     
     <tr align="center"><td >学号</td><td>姓名</td><td >专业</td><td>班级</td><td>总学分</td><td>平均学分绩点</td><td>智育成绩</td><td>班级排名</td><td>专业排名</td><td>密码</td><td>选课信息</td></tr>
	<%
	for(int j=0;j<i;j++){
	stu[j]=(Student)list.get(j);
	int rsid = stu[j].getStuid() ;
	String rsname = stu[j].getStuname() ;
    String rsmajor = stu[j].getStumajor() ;
	String rsclass = stu[j].getStuclass() ;
	double tcredit=stu[j].getTcredit();
	double acredit=stu[j].getAcredit();
	double egrade=stu[j].getEgrade();
	int classpm=stu[j].getClasspm();
	int majorpm=stu[j].getMajorpm();
    String scode=stu[j].getStucode();
	%>
            	<tr align="center">
		    		<td><%=rsid%></td>
		    		<td><%=rsname%></td>
		       		<td><%=rsmajor%></td>
		 	    	<td><%=rsclass%></td>
					<td><%=tcredit%></td>
					<td><%=Math.round(acredit*100)/100.0%></td>
					<td><%=Math.round(egrade*100)/100.0%></td>
					<td><%=classpm%></td>
					<td><%=majorpm%></td>
					<td><%=scode%></td>
					<td><a href="student_sel_other_cours.jsp?sid=<%=rsid %>">查看</a></td>
				</tr>
	<% 
	}
	if(i==0){	
	%>
	<tr><th colspan="11">无该学生信息！</th></tr>
	<%} %>
	</table>
	
	</body>
</html>
	