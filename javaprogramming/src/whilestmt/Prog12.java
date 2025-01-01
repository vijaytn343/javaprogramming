package whilestmt;
import java.util.Scanner;
public class Prog12 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number:");
	int a=scan.nextInt();
	int value=0;
	while(a>0) {
		int rem=a%2;
		value=value*10+rem;
		a=a/2;
			
	}
	int value1=0;
	while(value>0) {
		int rem=value%10;
		value1=value1*10+rem;
		value=value/10;
		
	}
	System.out.println(value1);
}
}
