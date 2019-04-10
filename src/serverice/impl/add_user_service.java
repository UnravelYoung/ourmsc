package serverice.impl;

import dao.coursedao;
import dao.impl.coursedaoimpl;
import serverice.add_user_servicee;
import dao.add_userdao;
import dao.impl.add_userdaoimpl;

public class add_user_service implements add_user_servicee{
    public String adduser(int userid, String username, String password, String role){
        add_userdao c=new add_userdaoimpl();
        c.adduser(userid,username, password,role);
        return("success");
    }
}
