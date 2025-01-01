package Scanner;
import java.util.Scanner;
public class Prog2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a:");
	int a=scan.nextInt();
	int c=a%10;
	String b=c==4?"yes":"no";
	System.out.println(b);
	scan.close();
	
}

}
