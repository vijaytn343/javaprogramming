package switchstmt;
import java.util.Scanner;
public class Prog6 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter num");
	//int a=scan.nextInt();
	char a=7868;
	switch( a) {
	case 1:
		System.out.println("odd");
		break;
	case 0:
		System.out.println("even");
		break;
	}
	scan.close();
}
}
