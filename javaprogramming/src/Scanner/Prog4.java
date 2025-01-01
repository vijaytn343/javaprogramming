package Scanner;
import java.util.Scanner;
public class Prog4 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a:");
	int a=scan.nextInt();
	System.out.println("enter b:");
	int b=scan.nextInt();
	System.out.println("enter c:");
	int c=scan.nextInt();
	int d=(a>b?(a>c?a:c):(b>c?b:c));
	System.out.println("highest number:"+d);
	scan.close();
}
}
