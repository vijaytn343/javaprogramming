package pattern;

import java.util.Scanner;

public class Prog3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int a=scan.nextInt();
		char count='A';
		for (int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
		scan.close();

	}}
