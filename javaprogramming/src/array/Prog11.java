package array;

import java.util.Scanner;

public class Prog11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		
		int[] a=new int[size];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		print(a,size);
	}
	public static void print(int[] a,int size) {
		System.out.println("original array");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int [] b=new int[size];
		for (int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		System.out.println("copied array");
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
