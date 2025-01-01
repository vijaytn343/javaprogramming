package whilestmt;
//import java.util.Scanner;
public class Prog7 {
public static void main(String[] args) {
	//Scanner scan=new Scanner(System.in);
	//System.out.println("enter number:");
	//int a=scan.nextInt();
	int a=1;
	while(a<50) {
		if(a%3==0&&a%5==0) {
			System.out.println(a);
		}
		a++;
	}
	//scan.close();
}
}
