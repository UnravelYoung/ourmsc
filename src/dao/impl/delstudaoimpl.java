package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import utils.DBUtils;
import dao.studentDao;

public class delstudaoimpl implements studentDao {

	@Override
	public void insertstudent(int sid, String sname, String smajor,
			String sclass, String scode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delstudent(int sid) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="delete from student where sid=?";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,sid);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List select(String sclass, String major) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List selectid(int sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stuupdate(int sid, String sname, String smajor, String sclass,
			String scode) {
		// TODO Auto-generated method stub
		
	}

}
