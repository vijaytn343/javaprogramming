package array;

import java.util.Scanner;

public class subarray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		
		int[] a=new int[size];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
