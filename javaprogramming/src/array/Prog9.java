package array;

import java.util.Scanner;

public class Prog9 {//right shift by 1;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		print(a);
		
		
	} 
	public static void print(int[] a) {
		int temp=a[a.length-1];
		for(int i=1;i<a.length;i++) {
			a[a.length-i]=a[a.length-(i+1)];
		}
		a[0]=temp;
		for (int i=0;i<a.length;i++) {
		   System.out.println(a[i]);
	   }

}

}
