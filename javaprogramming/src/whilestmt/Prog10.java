package whilestmt;
import java.util.Scanner;
public class Prog10 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number:");
	int a=scan.nextInt();
	int value=1;
	while(a>0) {
		value=value*a;
		a--;
	}
	System.out.println(value);
	scan.close();
	
}
}
