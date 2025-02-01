package forloop;

import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter number");
		int a=scan.nextInt();
		int square=a*a;
		int first=1;
		int last=1;
		
			first=square/10;
			last=square%10;
		
		int add=first+last;
		System.out.println(a);
		//System.out.println(first);
		//System.out.println(last);
		if(add==a) {
			System.out.println("it is neon number");
			
		}
		else {
			System.out.println("not");
		}
		scan.close();
	}

}
