package forloop;

import java.util.Scanner;

public class Prog7 {//sunny number
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int a=scan.nextInt();
		int b=a+1;
		int i=1;
		while(i*i<b) {
			i++;
			//System.out.println("no");
		}
		if(i*i==b) {
			System.out.println("its a sunny number");
		}
		else {
			System.out.println("no");
		}
		scan.close();
		//System.out.println("no");
	}

}
