package switchstmt;
import java.util.Scanner;
public class Prog1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if (a%2!=0) {
			System.out.println("Weird");
		}
		else if(a%2==0&&(a>=2&&a<=6)){
			System.out.println("Not Weird");
			
		}
		else if(a%2==0&&(a>=7&&a<=20)) {
			System.out.println("Weird");
		}
		else if(a%2==0&&a>20) {
			System.out.println("Not Weird");
		}
		scan.close();
	}

}
