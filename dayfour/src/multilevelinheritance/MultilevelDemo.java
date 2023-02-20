package multilevelinheritance;

import java.util.Scanner;

public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values");
		int Model_no=s.nextInt();
		
		s.nextLine();
		String version=s.nextLine();
		String slottype=s.nextLine();
		
		
		Iphone c =new Iphone();
		Iphone c1 =new Iphone(Model_no,version,slottype);
		
		c1.setModel_no(Model_no);
		c1.setVersion(version);
		c1.setSlottype(slottype);
		
		
		c1.accept();
		c1.display();
        c1.ok();
        System.out.println(c1);
	}

}
