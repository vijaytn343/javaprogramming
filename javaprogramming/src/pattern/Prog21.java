package pattern;

import java.util.Scanner;

public class Prog21 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int a=scan.nextInt();
	
		
		char count1='A';
		for (int i=1;i<=a;i++) {
			int k=3;
		
			for(int j=1;j<=a;j++) {
				
			
				if(i==j) {
					//i=count1;
					  
				
					System.out.print(count1);
					count1++;
					
					
				}
				else if(i==1) {
					System.out.print(k);
					
					k++;
				}
					
				
				
				else {
					System.out.print(k);
				
					k++;
				}
				
				
			}
				
				//count++;
			
			System.out.println();
		}
		scan.close();

}}