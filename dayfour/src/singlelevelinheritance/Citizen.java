package singlelevelinheritance;

public class Citizen {
	private String name;
	private String adharno;
	private String city;
	private int mbno;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(int mbno) {
		this.mbno = mbno;
	}
	public Citizen() {
		super();
		System.out.println("THIS is SUPER CLASS");
		
	}
	// parametrized 
	
	public Citizen(String name, String adharno, String city, int mbno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mbno = mbno;
	}
	
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mbno=" + mbno + ", getName()="
				+ getName() + ", getAdharno()=" + getAdharno() + ", getCity()=" + getCity() + ", getMbno()=" + getMbno()
				+ "]";
	}
	
	

}
