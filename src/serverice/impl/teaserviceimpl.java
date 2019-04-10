package serverice.impl;

import dao.teacherdao;
import dao.userdao;
import dao.impl.deluserdaoimpl;
import dao.impl.teacherdaoimpl;
import dao.impl.userdaoimpl;
import serverice.teaservice;

public class teaserviceimpl implements teaservice {
	
	teacherdao tea=new teacherdaoimpl();
    userdao t=new userdaoimpl();

	@Override
	public String deltea(int tid) {
		// TODO Auto-generated method stub
		
		
		 tea.delteacher(tid);
		 t.delteacher(tid);
	      String result="success";
	     
	      return result;
		}


	@Override
	public String selecttea(int tid, String tname) {
		// TODO Auto-generated method stub
		tea.select(tid, tname,"");
		return "success";
	}

	@Override
	public String selecttid(int tid) {
		// TODO Auto-generated method stub
		tea.selectid(tid);
		return "success";
	}

	@Override
	public String inserttea(int tid, String tname, String tcode) {
		// TODO Auto-generated method stub
		tea.inserttea(tid, tname, tcode);
		t.inserttea(tid, tname, tcode, "");
		return "success";
	}

	@Override
	public String updatetea(int tid, String tname, String tcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
