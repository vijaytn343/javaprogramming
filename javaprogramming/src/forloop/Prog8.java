package forloop;

import java.util.Scanner;

public class Prog8 {//largest prime number between two numbers
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter fist num");
		int a=scan.nextInt();
		System.out.println("enter second num");
		int b=scan.nextInt();
		//int count=0;
		for (int i=b;i>a;i--) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
				
			}
			if(count==2) {
				System.out.println(i);
				break;
				
			
			}
		
			
		}
		scan.close();
	}

}
