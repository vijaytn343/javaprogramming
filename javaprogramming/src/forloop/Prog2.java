package forloop;

import java.util.Scanner;

public class Prog2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num:");
		int a=scan.nextInt();
		int b=count(a);
		int c=sum(b,a);
		System.out.println(c);
		if(a==c) {
			System.out.println("it is armstrong number");}
		else {
			System.out.println("not armstrong number ");
		}
		
	scan.close();	
	}
	public static int count(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}
	public static int sum(int c,int a ) {
		int add1=1;
		int add=0;
		
		for (int i=0;i<c;i++) {
			int v=c;
			
			while(v>0) {
				//int add1=1;
				int rem=a%10;
				add1=add1*rem;
				v--;
			}
			add=add+add1;
			 add1=1;
			a=a/10;
			
			//add1=0+add1;
		}
		return add;
	}
	

}
