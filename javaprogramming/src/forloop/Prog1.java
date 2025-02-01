package forloop;

import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter howmany fibo number ");
		int num=scan.nextInt();
		int fibo=0;
		int num1=0;
		int num2=1;
		
		for(int i=0;i<num;i++){
			fibo=num1+num2;
			num1=num2;
			num2=fibo;
			System.out.println(fibo);
			
		}
		scan.close();
	}

}
