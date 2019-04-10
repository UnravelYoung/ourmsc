package serverice;

import java.util.List;

public interface stuaddservice {
	public String insertstudent(int sid,String sname,String smajor,String sclass,String scode);
	public String stuupdate(int sid,String sname,String smajor,String sclass,String scode);
}
