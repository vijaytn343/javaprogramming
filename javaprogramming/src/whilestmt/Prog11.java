package whilestmt;
import java.util.Scanner;
public class Prog11 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter num:");
	int a=scan.nextInt();
	System.out.println("enter power:");
	int b=scan.nextInt();
	int value=1;
	while(b>0) {
		value=value*a;
		b--;
	}
	System.out.println(value);
	scan.close();
}
}
