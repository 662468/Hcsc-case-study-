package bean;
import java.util.List;
public class AppDetails {

	private String appid;
	private String appname;
	//private String upstream;
	//private String downstream;
	private List<AppObject> upstream;
	private List<AppObject> downstream;
	
	
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
	
	
   /* public String getUpstream() {
		return upstream;
	}
	public void setUpstream(String upstream) {
		this.upstream = upstream;
	}
	public String getDownstream() {
		return downstream;
	}
	public void setDownstream(String downstream) {
		this.downstream = downstream;
	}*/
	public AppDetails() {
		super();
		}
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
	public AppDetails(String appid, String appname, List<AppObject> upstream, List<AppObject> downstream) {
		super();
		this.appid = appid;
		this.appname = appname;
		this.upstream = upstream;
		this.downstream = downstream;
	}
	
	
	
	
}
