package forloop;

import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first num:");
		int a=scan.nextInt();
		System.out.println("enter second num:");
		int b=scan.nextInt();
		for (int i=a;i<b;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if (count==2) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
