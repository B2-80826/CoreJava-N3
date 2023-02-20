package singlelevelinheritance;

public class Student extends Citizen {
	private int Rollno;
	private String Student_name;
	
	// getter and setter
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	
	public Student() {
		super();
		
	}
	public Student(String name, String adharno, String city, int mbno) {
		super(name, adharno, city, mbno);
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, String adharno, String city, int mbno, int rollno, String student_name) {
		super( name,  adharno,  city,  mbno);
		Rollno = rollno;
		Student_name = student_name;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Student_name=" + Student_name + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
