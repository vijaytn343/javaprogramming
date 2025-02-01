package pattern;

import java.util.Scanner;

public class Prog13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int row=1;row<=2*n-1;row++) {
			for (int col=1;col<=2*n-1;col++) {
				if(row+col==n+1||col-row==n-1||row-col==n-1||row+col==3*n-1)  {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();
			
		}
	}
}
