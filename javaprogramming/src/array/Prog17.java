package array;

import java.util.Scanner;

public class Prog17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		int size=scan.nextInt();
		System.out.println("enter elements");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
		System.out.println("before Swapping");
		print(a);
		bubble(a);
		System.out.println("after swapping");
		print(a);
	}
	public static void print(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void bubble(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				
				}
			}
		}
	}

}
