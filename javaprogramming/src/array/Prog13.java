package array;

import java.util.Scanner;

public class Prog13 {//remove an element using index value;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		
		int[] a=new int[size];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("original array");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("enter element to be removed");
		int element =scan.nextInt();
		print(a,element,size);
	}
	public static void print(int[] a,int element,int size) {
		
	int[] b=new int[size];
	for(int i=0;i<b.length;i++) {
		b[i]=a[i];
	}
		
	System.out.println("after element removed");
	for (int i=0;i<b.length;i++) {
		if (a[i]!=element) {
			System.out.println(b[i]);
		}
		
		
	}

	}}
