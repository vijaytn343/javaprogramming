package forloop;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num:");
		int a=scan.nextInt();
		int count=0;
		for (int i=1;i<a;i++)
		{
			if(a%i==0) {
				count++;
				
			}
		}
		if(count==1) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
	scan.close();
	}
		
	}


