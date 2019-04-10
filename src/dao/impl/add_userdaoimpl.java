package dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utils.DBUtils;
import dao.add_userdao;

public class add_userdaoimpl implements add_userdao {

    public void adduser(int userid, String username, String password, String role) {
        // TODO Auto-generated method stub
        Connection conn = DBUtils.getConnection();
        String sql = "insert into user(userid,username,password,role) value(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userid);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, role);
            ps.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
