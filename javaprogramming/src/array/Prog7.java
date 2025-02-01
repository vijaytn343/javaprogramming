package array;

import java.util.Scanner;

public class Prog7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i=a.length-1;i>=0;i--) {
			a[i]=scan.nextInt();
		}
		print(a);
	}
	public static void print(int [] a) {
		System.out.println("array elements:");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
