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
		<title>查看留言</title>
		<link rel="stylesheet" type="text/css" href="image/mystyle1.css">
	</head>
	<jsp:useBean id="msgdao" class="dao.impl.lybimpl" scope="page" />
	<body bgcolor="#8dd8f8">
	<%
	request.setCharacterEncoding("UTF-8");
	List all=msgdao.select();
	int i=all.size();
	lyb msg[]=new lyb[i];
    %>
	<div align="center"><font size="5" color="#000080" face="华文楷体"><b>留言板：<br><br></b></font></div> 
     <table border="1" cellspacing="0" cellpadding="0" align="center">
     <tr align="center"><td width="80">编号</td><td width="80">姓名</td><td width="110">留言时间</td><td width="450">留言内容</td></tr>
     <%
     for(int j=0;j<i;j++)
     {    
      msg[j]=(lyb)all.get(j);
      int mid=msg[j].getUserid();
      String name = msg[j].getName();
      String time = msg[j].getTime();
      String rcontent = msg[j].getText();
      if(1==0){
      %>
      <tr align="center" height="25">
      <td><%=mid %></td>
      <td align="left"><%=rcontent %></td>
      <td height="10" width="50" background="image/delete.gif " align="center"><strong><a href="msg_dealing.jsp?mid=<%=mid%>&action=delete">删除</a></strong></td>
       </tr>
       <%}else{ %>
      <tr align="center" height="25">
      <td><%=mid %></td>
      <td><%=name%></td>
      <td><%=time%></td>
      <td><%=rcontent %></td>
      <td align="left"><%=rcontent %></td>
      <td height="10" width="50" background="image/delete.gif " align="center"><strong><a href="admin_lyb_ly.jsp?rid=<%=mid %>">回复</a></strong></td>
      <td height="10" width="50" background="image/delete.gif " align="center"><strong><a href="admin_msg_dealing.jsp?mid=<%=mid%>&action=delete">删除</a></strong></td>
       </tr>
       <%} 
       }
	   if(i==0){	
	  %>
	<tr><th colspan="10">无留言信息！</th></tr>
	<%} %>
       </table>
	</body>
</html>
