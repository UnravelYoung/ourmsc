package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import po.user;
import utils.DBUtils;
import dao.userdao;

public class deluserdaoimpl implements userdao {

	@Override
	public user queryuserByIdAndPwd(user u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addstudent(int sid, String sname, String scode, String kind) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delstudent(int sid) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="delete from user where userid=? and role=?";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,sid);
			ps.setString(2,"student");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void stuupdate(int sid, String scode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delteacher(int tid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserttea(int tid, String tname, String tcode, String kind) {
		// TODO Auto-generated method stub
		
	}
		

}
