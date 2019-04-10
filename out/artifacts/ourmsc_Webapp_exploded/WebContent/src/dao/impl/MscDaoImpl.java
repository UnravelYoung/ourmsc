package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import utils.DBUtils;
import dao.MscDao;

public class MscDaoImpl implements MscDao {

	@Override
	public double countStudent() {
		double countsum=0;
		Connection conn=DBUtils.getConnection();
		String sql="select count(sid) from student";
		try {
		PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				countsum=rs.getDouble("count(sid)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countsum;
	}
	@Override
	public double countTeacher() {
		double countsum=0;
		Connection conn=DBUtils.getConnection();
		String sql="select count(tid) from teacher";
		try {
		PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				countsum=rs.getDouble("count(tid)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countsum;
		
	}
	
	@Override
	public double countCourse() {
		double countsum=0;
		Connection conn=DBUtils.getConnection();
		String sql="select count(cno) from course";
		try {
		PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				countsum=rs.getDouble("count(cno)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countsum;
	}
	
	@Test
	public void ttt(){
		new MscDaoImpl().countStudent();
		
	}


}
