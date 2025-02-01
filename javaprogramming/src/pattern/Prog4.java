package pattern;

import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int a=scan.nextInt();
		//int count=1;
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print(i);
				//count++;
			}
			System.out.println();
		}
		scan.close();

}}
