package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.Student;
import utils.DBUtils;
import dao.studentDao;

public class studentDaoimpl implements studentDao {

	@Override
	public void insertstudent(int sid, String sname, String smajor,
			String sclass, String scode) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="insert into student(sid,sname,smajor,sclass,scode) value(?,?,?,?,?)";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,sid);
			ps.setString(2,sname);
			ps.setString(3,smajor);
			ps.setString(4,sclass);
			ps.setString(5,scode);
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
	public List select(int sid, String sclass, String major) {
		// TODO Auto-generated method stub
		Student student=null;
		List<Student>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="select * from student where  sclass like ? and smajor like ?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);

			ps.setString(1,"%"+sclass+"%");
			ps.setString(2,"%"+major+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student stu=new Student();
				stu.setAcredit(rs.getDouble("acredit"));
				stu.setClasspm(rs.getInt("classpm"));
				stu.setEgrade(rs.getDouble("egrade"));
				stu.setMajorpm(rs.getInt("majorpm"));
				stu.setOcredit(rs.getDouble("ocredit"));
				stu.setStuclass(rs.getString("sclass"));
				stu.setStucode(rs.getString("scode"));
				stu.setStuid(rs.getInt("sid"));
				stu.setStumajor(rs.getString("smajor"));
				stu.setStuname(rs.getString("sname"));
				stu.setTcredit(rs.getDouble("tcredit"));
				stu.setTcreditjd(rs.getDouble("tcreditjd"));
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List selectid(int sid) {
		// TODO Auto-generated method stub
		Student student=null;
		List<Student>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="select *from student where  sid=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);

			ps.setInt(1,sid);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student stu=new Student();
				stu.setAcredit(rs.getDouble("acredit"));
				stu.setClasspm(rs.getInt("classpm"));
				stu.setEgrade(rs.getDouble("egrade"));
				stu.setMajorpm(rs.getInt("majorpm"));
				stu.setOcredit(rs.getDouble("ocredit"));
				stu.setStuclass(rs.getString("sclass"));
				stu.setStucode(rs.getString("scode"));
				stu.setStuid(rs.getInt("sid"));
				stu.setStumajor(rs.getString("smajor"));
				stu.setStuname(rs.getString("sname"));
				stu.setTcredit(rs.getDouble("tcredit"));
				stu.setTcreditjd(rs.getDouble("tcreditjd"));
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void stuupdate(int sid,String sname,String smajor,String sclass,String scode){
		List<Student>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="update set sname=?,smajor=?,sclass=?,scode=? where sid=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, sid);
			ps.setString(2,sname);
			ps.setString(3,smajor);
			ps.setString(4,sclass);
			ps.setString(5,scode);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
