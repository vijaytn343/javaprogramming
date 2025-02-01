package array;

import java.util.Scanner;

public class Prog3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int size=scan.nextInt();
		int[] a=new int[size];
		System.out.println("enter elements");
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
