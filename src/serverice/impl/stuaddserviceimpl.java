package serverice.impl;

import dao.studentDao;
import dao.userdao;
import dao.impl.studentDaoimpl;
import dao.impl.userdaoimpl;
import serverice.stuaddservice;

public class stuaddserviceimpl implements stuaddservice {
	
	userdao sd=new userdaoimpl();
    studentDao st=new studentDaoimpl();
	@Override
	public String insertstudent(int sid, String sname, String smajor,
			String sclass, String scode) {
		// TODO Auto-generated method stub
		st.insertstudent(sid, sname, smajor, sclass, scode);
		sd.addstudent(sid, sname, scode, "student");
      String result="success";
     
      return result;
	}
	@Override
	public String stuupdate(int sid, String sname, String smajor,
			String sclass, String scode) {
		// TODO Auto-generated method stub
		st.stuupdate(sid, sname, smajor, sclass, scode);
		return "success";
	}


}
