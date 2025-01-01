package switchstmt;
import java.util.Scanner;
public class Prog4 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter gender:");
	String gender=scan.next();
	System.out.println("enter yearof service:");
	int year=scan.nextInt();
	System.out.println("enter qualification:");
	String qualif=scan.next();
	if(gender.equals("male")) 
	{
		if(year>=10&&qualif.equals("PG")) {
			System.out.println("salary:"+15000);
		}
		
		else if(year>=10&&qualif.equals("G")) {
			System.out.println("salary:"+10000);
		}
	
	else if(year<10&&qualif.equals("PG")) {
		System.out.println("salary:"+10000);
	}
	else if(year<10&&qualif.equals("G")) {
		System.out.println("salary:"+7000);
	}
	
}
	else if(gender.equals("female")) {
		
	if(year>=10&&qualif.equals("PG")) {
		System.out.println("salary:"+15000);
	}
	else if(year>=10&&qualif.equals("G")) {
		System.out.println("salary:"+10000);
	}

	else if(year<10&&qualif.equals("G")) {
	System.out.println("salary:"+7000);
}
	}
scan.close();
}
}
