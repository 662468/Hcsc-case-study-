package bean;

public class User {

	private String userid;
	private String status;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public User(String userid, String status) {
		super();
		this.userid = userid;
		this.status = status;
	}
	public User() {
		super();
	}
}
