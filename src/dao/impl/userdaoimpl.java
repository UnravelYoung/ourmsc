package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import po.user;
import utils.DBUtils;
import dao.userdao;

public  class userdaoimpl implements userdao {

	@Override
	public user queryuserByIdAndPwd(user u) {
		// TODO Auto-generated method stub

		user us=null;
		Connection conn=DBUtils.getConnection();
		String sql="SELECT *from user where userid=? and password=? and role = ?";
		try {
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,u.getUserid());
		ps.setString(2,u.getPassword());
		ps.setString(3,u.getRole());
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
			us=new user();
			us.setUserid(rs.getInt("userid"));
			us.setUsername(rs.getString("username"));
			us.setPassword(rs.getString("password"));
			us.setRole(rs.getString("role"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return us;
	}
	@Test
  	public void test(){
  		System.out.println(new userdaoimpl().queryuserByIdAndPwd(new user(110,"","123456","")));
  	}
	
	public void addstudent(int sid,String sname,String scode,String kind){
		String sql="insert into user(userid,username,password,role) value(?,?,?,?)";
		Connection conn=DBUtils.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,sid);
			ps.setString(2,sname);
			ps.setString(3,scode);
			ps.setString(4,kind);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void stuupdate(int sid,String scode){
		String sql="update user set password=? where userid=?";
		Connection conn=DBUtils.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, scode);
			ps.setInt(2, sid);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void delstudent(int sid) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delteacher(int tid) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="delete from user where userid=? and role=?";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,tid);
			ps.setString(2,"teacher");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void inserttea(int tid, String tname, String tcode, String kind) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="insert into user(userid,username,password,role) value(?,?,?,?)";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,tid);
			ps.setString(2,tname);
			ps.setString(3,tcode);
			ps.setString(4,"teacher");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
