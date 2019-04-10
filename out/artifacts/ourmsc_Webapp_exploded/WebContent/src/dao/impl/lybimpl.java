package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.lybdao;
import po.Course;
import po.lyb;
import utils.DBUtils;

public class lybimpl implements lybdao {

	@Override
	public List select() {
		// TODO Auto-generated method stub
		List<lyb>list=new ArrayList<>();
		Connection conn=DBUtils.getConnection();
		String sql="select * from lyb";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				lyb l=new lyb();
				l.setUserid(rs.getInt("userid"));
				l.setName(rs.getString("name"));
				l.setTime(rs.getString("time"));
				l.setText(rs.getString("text"));
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
