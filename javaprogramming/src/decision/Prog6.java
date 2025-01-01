package decision;
import java.util.Scanner;
public class Prog6 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no of days:");
	int a=scan.nextInt();
	library(a);
	scan.close();
	}
public static void library(int a) {
	
	if(a>=1&&a<=5) {
		//double b=a*0.5;
		System.out.println(a*0.5+"rs");
		return;
	}
	else if(a>=6&&a<=10) {
		//double b=a*1;
		System.out.println(a*1+"rs");
		return;
	}
	else if(a>10&&a<=30) {
		System.out.println(a*5+"rs");
		return;
	}
	else if(a>30) {
		System.out.println("membership cancelled");
		return;
	}
	else {
		System.out.println("no fine");
	}
	}

}
