package Scanner;
import java.util.Scanner;
public class Prog3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter a:");
	int a=scan.nextInt();
	String b=(a%4==0&&a%100!=0)||a%400==0?"yes":"no";
	System.out.println(b);
	scan.close();
}
}
