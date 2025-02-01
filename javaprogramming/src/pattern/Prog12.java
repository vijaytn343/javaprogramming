package pattern;

import java.util.Scanner;

public class Prog12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int b=(n+1)/2;
		for (int row=1;row<=n;row++) {
			for (int col=1;col<=n;col++) {
				if(row==3&&col!=1&&col!=n) {
					System.out.print(" ");
				}else if(col==b&&row!=1&&row!=n) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
		}
			System.out.println();
			
		}

}
}
