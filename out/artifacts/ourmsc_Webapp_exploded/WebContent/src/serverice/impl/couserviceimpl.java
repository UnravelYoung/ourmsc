package serverice.impl;

import dao.coursedao;
import dao.impl.coursedaoimpl;
import serverice.couservice;

public class couserviceimpl implements couservice {
	
     coursedao cou=new coursedaoimpl();
     
	@Override
	public String delcou(int cno) {
		// TODO Auto-generated method stub
		cou.deletecou(cno);
		return "success";
	}

	@Override
	public String selectcou(int cno, String cname) {
		// TODO Auto-generated method stub
		cou.select(cno, cname, 0.0);
		return "success";
	}

	@Override
	public String selectcno(int cno) {
		// TODO Auto-generated method stub
		cou.selectid(cno);
		return "success";
	}

	@Override
	public String insertcou(int cno, String cname, double credit){
		coursedao c=new coursedaoimpl();
		c.insertcou(cno, cname, credit);
		return "success";
		
	}
	@Override
	public String updatecou(int cno, String cname, double credit) {
		// TODO Auto-generated method stub
		cou.updatecou(cno, cname, credit);
		return "success";
	}

}
