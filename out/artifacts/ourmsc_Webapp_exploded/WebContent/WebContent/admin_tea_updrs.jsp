
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="po.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()

+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <jsp:useBean id="tdao" scope="page" class="dao.impl.teacherdaoimpl"></jsp:useBean>
    <title></title>
    <SCRIPT Language=javascript>
 <!--
  function isValid()
  {	
  	if(formupdate.tname.value == "")
  	{	
  		window.alert("教师姓名为空！"); 
 		document.formupdate.elements(0).focus();
  		return  false;
  	}
  	
  	if(formupdate.tcode.value=="")
  	{
  	    window.alert("教师密码为空！");
  	    document.formupdate.elements(1).focus();
  	    return  false;
  	}
  	formupdate.submit();
 }
  -->
  </SCRIPT>		

  </head>
  
  <body bgcolor="#8dd8f8">
    <%
    request.setCharacterEncoding("utf-8");
    int tid=Integer.parseInt(request.getParameter("tid"));
    List list=tdao.selectid(tid);
    int i=list.size();
    Teacher tea[]=new Teacher[i];
    	
     %>
     <div align="center"><font size="6" color="#000080" face="华文楷体"><b><font size="5">修改教师信息<br><br><br></font> 
 
</b></font></div>
     <form name="formupdate" action="teaservlet" method="post" onsubmit="return isValid(this);">
     <table width="650" border="1" cellspacing="0" cellpadding="0" align="center">
     <tr><th height="25" colspan="2"><input type="hidden" name="flag" value="update"/>请在下表输入

修改后教师信息</th></tr>
	<%
	for(int j=0;j<i;j++){
	tea[j]=(Teacher)list.get(j);
	int rtid = tea[j].getTid();
	String rtname = tea[j].getTname() ;
    String rtcode=tea[j].getTcode();
	%>
	<tr><td>教师工号：</td><td><input type="text" name="tid" value="<%=rtid%>" readonly/></td></tr>
	<tr><th colspan="2" height="15"></th></tr>
	<tr><td>教师姓名：</td><td><input type="text" name="tname" value="<%=rtname %>"/></td></tr>
	<tr><th colspan="2" height="15"></th></tr>
	<tr><td>教师密码：</td><td><input type="text" name="tcode" value="<%=rtcode %>"/></td></tr>
	<tr><th colspan="2" height="15"></th></tr>
     <tr><td><input type="reset" value="重  置"/></td><td><input type="submit" value="提  交"/></td></tr>
	<% 
	}
	if(i==0){	
	%>
	<tr><th colspan="5">无该教师信息！</th></tr>
	<%} %>

    
      </table>
     </form>
  </body>
</html>