package serverice.impl;
import dao.impl.studentDaoimpl;
import dao.studentDao;
import dao.userdao;
import dao.impl.delstudaoimpl;
import dao.impl.deluserdaoimpl;
import serverice.studelservice;
import java.util.ArrayList;
import java.util.List;

public class studelserviceimpl implements studelservice {

		studentDao dsd=new delstudaoimpl();
		userdao stu=new deluserdaoimpl();

		@Override
		public String delstudent(int sid) {
			// TODO Auto-generated method stub
			dsd.delstudent(sid);
			stu.delstudent(sid);
			String result="success";

			return result;
		}

		public String selectid(int sid)
		{
			studentDao st = new studentDaoimpl();
			st.selectid(sid);
			String result = "Success";
			return result;
		}


}
