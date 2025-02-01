package array;

import java.util.Scanner;

public class maximumprod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		int size=scan.nextInt();
		System.out.println("enter elements");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
	}
		int prod1=0;
		for(int i=0;i<a.length;i++) {
			int prod=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]*a[j]>prod && i!=j) {
					prod=a[i]*a[j];
					if(prod>prod1) {
						prod1=prod;
					}
					
				}
			}
			
		}
		System.out.println(prod1);
	}

}
