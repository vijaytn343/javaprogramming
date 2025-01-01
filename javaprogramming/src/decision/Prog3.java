package decision;
import java.util.*;
public class Prog3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a:");
	int a=scan.nextInt();
	System.out.println("enter b:");
	int b=scan.nextInt();
	System.out.println("enter c:");
	int c=scan.nextInt();
	sumoftri(a,b,c);
	scan.close();
	
}
public static void sumoftri(int a,int b,int c) {
	int d=a+b+c;
	if(d==180) {
		System.out.println("triangle");
	}else {
		System.out.println("no");
	}
}
}
