package array;

import java.util.Scanner;

public class twosum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		int size=scan.nextInt();
		System.out.println("enter elements");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
	}
		System.out.println("enter sum value");
		int value=scan.nextInt();
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==value&&i!=j) {
					sum=a[i]+a[j];
					
						System.out.println(a[i]);
						System.out.println(a[j]);
						break;
					
					
				}
			}
			System.out.println("-----");
			if(sum==value) {
				break;
			}
			//System.out.println("------");
			
		}
	
	}

}
