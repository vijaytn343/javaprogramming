package decision;
import java.util.Scanner;

public class Prog7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number:");
	int a=scan.nextInt();
	if(a-30>0) {
		System.out.println(30);
	}else {
		System.out.println(a*a*a);
	}
	scan.close();}
}
