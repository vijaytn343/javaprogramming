package decision;
import java.util.Scanner;
public class Prog1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a:");
		int a=scan.nextInt();
		if(a%10==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		scan.close();
	}

}
