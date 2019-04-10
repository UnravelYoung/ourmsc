package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.Course;
import po.Student;
import po.Teacher;
import utils.DBUtils;
import dao.coursedao;

public class coursedaoimpl implements coursedao {

	@Override
	public void insertcou(int cno, String cname, double credit) {
		// TODO Auto-generated method stub
		Connection conn = DBUtils.getConnection();
		String sql = "insert into course(cno,cname,credit) value(?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cno);
			ps.setString(2, cname);
			ps.setDouble(3, credit);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deletecou(int cno) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="delete from course where cno=?";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,cno);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	public List select(int cno, String cname, double credit) {
		// TODO Auto-generated method stub
		List<Course>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="select * from course where cno = ?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);

			ps.setInt(1,cno);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Course c=new Course();
				c.setCounumber(cno);				
				c.setCouname(rs.getString("cname"));
				c.setCredit(credit);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List selectid(int cno) {
		// TODO Auto-generated method stub
		List<Course>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="select * from course where  tid=? ";

			try {
				PreparedStatement ps=conn.prepareStatement(sql);

				ps.setInt(1,cno);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					Course c=new Course();
					c.setCounumber(cno);
					c.setCouname(rs.getString("cname"));
					c.setCredit(rs.getDouble("credit"));
					list.add(c);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}

	@Override
	public void updatecou(int cno, String cname, double credit) {
		// TODO Auto-generated method stub
		List<Student>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="update set cname=?,credit=? where cno=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, cname);
			ps.setDouble(2,credit);
			ps.setString(3,cname);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      
	}

}
