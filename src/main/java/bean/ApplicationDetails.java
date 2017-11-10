package bean;

import java.io.Serializable;
import java.util.List;

public class ApplicationDetails   {
	
	private String appid;
	private String appname;
	
	
	private AppObject[] upstream;
	private AppObject[] downstream;
	
	/*	
	private List<AppObject> upstream;
		private List<AppObject> downstream;
		
	public List<AppObject> getUpstream() {
		return upstream;
	}


	public void setUpstream(List<AppObject> upstream) {
		this.upstream = upstream;
	}


	public List<AppObject> getDownstream() {
		return downstream;
	}


	public void setDownstream(List<AppObject> downstream) {
		this.downstream = downstream;
	}
*/

	
	


	public String getAppid() {
		return appid;
	}


	public void setAppid(String appid) {
		this.appid = appid;
	}


	public String getAppname() {
		return appname;
	}


	public void setAppname(String appname) {
		this.appname = appname;
	}


public AppObject[] getUpstream() {
		return upstream;
	}


	public void setUpstream(AppObject[] upstream) {
		this.upstream = upstream;
	}


	public AppObject[] getDownstream() {
		return downstream;
	}


	public void setDownstream(AppObject[] downstream) {
		this.downstream = downstream;

}
	

	public ApplicationDetails() {
		super();
		
		
	}
}
