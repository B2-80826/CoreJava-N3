package multilevelinheritance;

public class Android extends nokia{
	private String version;
	
	
	public void accept() {
		
		System.out.println("Nokia Class"+version);
	}


	public Android(int Model_no, String version) {
		super();
		this.version = version;
	}


	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Android [version=" + version + ", getModel_no()=" + getModel_no() + "]";
	}


	
	

}
