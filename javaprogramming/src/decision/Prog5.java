package decision;
import java.util.Scanner;
public class Prog5 {
public static void main(String[] args) {
	Scanner  scan=new Scanner(System.in);
	System.out.println("enter length:");
	int a=scan.nextInt();
	System.out.println("enter breadth:");
	int b=scan.nextInt();
	int area =a*b;
	int peri=2*(a+b);
	if(area>peri) {
		System.out.println("area is greater");
	}
	else {
		System.out.println("perimeter is greater");
	}
	scan.close();
	
}
}
