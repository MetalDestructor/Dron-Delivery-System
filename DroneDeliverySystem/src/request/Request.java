package request;

import java.util.Date;

public interface Request {

	public String getId();
	public Date getTimestamp();	
	public void setId(String id);
	public void setTimestamp(Date timeStamp);
}