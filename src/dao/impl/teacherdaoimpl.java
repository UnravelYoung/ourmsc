package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.Student;
import po.Teacher;
import utils.DBUtils;
import dao.teacherdao;

public class teacherdaoimpl implements teacherdao {

	@Override
	public void inserttea(int tid, String tname, String teacode) {
		// TODO Auto-generated method stub
		Connection conn = DBUtils.getConnection();
		String sql = "insert into teacher(tid,tname,tpwd) value(?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, tid);
			ps.setString(2, tname);
			ps.setString(3, teacode);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delteacher(int tid) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="delete from teacher where tid=?";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,tid);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List select(int tid, String tname, String teacode) {
		// TODO Auto-generated method stub
		List<Teacher>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="select * from teacher where tname like ?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);

			ps.setString(1,"%"+tname+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Teacher tea=new Teacher();
				tea.setTid(tid);				
				tea.setTname(rs.getString("tname"));
				tea.setTcode(rs.getString("tpwd"));
				list.add(tea);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List selectid(int tid) {
		// TODO Auto-generated method stub
		List<Teacher>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="select * from teacher where  tid=? ";

			try {
				PreparedStatement ps=conn.prepareStatement(sql);

				ps.setInt(1,tid);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					Teacher tea=new Teacher();
					tea.setTid(tid);
					tea.setTcode(rs.getString("tpwd"));
					tea.setTname(rs.getString("tname"));
					list.add(tea);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
			
	}

	@Override
	public void teaupdate(int tid, String tname, String teacode) {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="update set tname=?,tpwd=? where tid=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1,tname);
			ps.setString(2,teacode);
			ps.setInt(3, tid);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
