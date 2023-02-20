package multilevelinheritance;

public class Iphone extends Android {
 private String slottype;
 
 public void slot() {
	 System.out.println("Slot is "+slottype);
 }

public Iphone() {
	super();
	// TODO Auto-generated constructor stub
}

public void ok() {
	System.out.println("slot No is"+slottype);
}

public Iphone(int Model_no, String version,String slottype) {
	super();
	this.slottype = slottype;
}

public String getSlottype() {
	return slottype;
}

public void setSlottype(String slottype) {
	this.slottype = slottype;
}

@Override
public String toString() {
	return "Iphone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModel_no()=" + getModel_no() + "]";
}
 
 
}


