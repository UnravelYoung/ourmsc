<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title></title>
</head>

<body bgcolor="#8dd8f8">
<form name="formaddstu" action="user_add" method="post" onsubmit="return isValid(this);"><div align="center">
    <font color="#0000a0" size="5" face="华文楷体"> <strong>注册<br><br><br></strong></font>
</div><table border="1" width="600" height="120" align="center" cellspacing="0" cellpadding="0">
    <tr><th colspan="2" height="25"><font size="4">请输入用户信息</font></th></tr>
    <tr><td height="20">用户id：</td><td><input type="text" name="userid"/></td></tr>
    <tr><th colspan="2" height="15"></th></tr>
    <tr><td height="20">用户名：</td><td><input type="text" name="username"/></td></tr>
    <tr><th colspan="2" height="15"></th></tr>
    <tr><td height="20">用户身份：</td>
        <td><SELECT name="usermajor">
            <OPTION>admin</OPTION>
        </SELECT></td></tr>
    <input type="hidden" name="flag" value="new">
    <tr><th colspan="2" height="15"></th></tr>
    <tr><td height="20">登录密码：</td><td><input type="text" name="usercode"/>
        <input type="hidden" name="uadd" value="new"></td></tr>
    <tr><th colspan="2" height="15"></th></tr>
    <tr><td><input type="submit" value="提&nbsp&nbsp交"/></td></tr>
</table>

</form>
<br/><br/><br/>
</body>
</html>
