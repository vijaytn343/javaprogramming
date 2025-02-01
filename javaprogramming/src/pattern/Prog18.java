package pattern;

import java.util.Scanner;

public class Prog18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int a=scan.nextInt();
		
		char count1='A';
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i>=j) {
				if(i%2==0) {
					//i=count1;
					  
				
					System.out.print(count1);
					count1++;
					
					
				}
				if(i%2!=0) {
					System.out.print(j);
				}
				}
				else {
					System.out.print(" ");
					
				}
				
			}
				
				//count++;
			
			System.out.println();
		}
		scan.close();
	}
}
