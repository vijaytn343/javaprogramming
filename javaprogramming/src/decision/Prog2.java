package decision;
import java.util.*;
public class Prog2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a:");
		int a=scan.nextInt();
		System.out.println("enter b:");
		int b=scan.nextInt();
		System.out.println("enter c:");
		int c=scan.nextInt();
		check(a,b,c);
		//if(d>0) {
			//System.out.println("highest num:"+d);
		//}
		scan.close();
		
		
	}
	public static void check(int a,int b,int c) {
		//return(a>b?(a>c?a:c):(b>c?b:c));
		if(a>b&&a>c) {
			System.out.println(a);
		}
		if(b>c&&b>a) {
			System.out.println(b);
			return;
		}
		if(c>a&&c>b) {
			System.out.println(c);
			return;
		}
	}

}
