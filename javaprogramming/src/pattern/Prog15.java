package pattern;

import java.util.Scanner;

public class Prog15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int a=scan.nextInt();
		
		int count1=1;
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i>=j) {
					
					System.out.print(count1);
					count1++;
					
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
