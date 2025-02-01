package pattern;

import java.util.Scanner;

public class Prog14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int row=1;row<=2*n-1;row++) {
			for (int col=1;col<=2*n-1;col++) {
				if((col+row<=2*n&&row>=col)||(row<=col&&row+col>=2*n)) {
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