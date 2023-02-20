package multilevelinheritance;

public class nokia {
	private int Model_no; 
	
	@Override
	public String toString() {
		return "nokia [Model_no=" + Model_no + "]";
	}

	public void display() {
		System.out.println("Model No is"+Model_no);
	}

	public int getModel_no() {
		return Model_no;
	}

	public void setModel_no(int model_no) {
		Model_no = model_no;
	}

	public nokia() {
		
	}
	
}
