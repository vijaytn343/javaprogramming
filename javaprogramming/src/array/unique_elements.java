package array;

import java.util.Scanner;

public class unique_elements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		int size=scan.nextInt();
		System.out.println("enter elements");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int count=0;
		
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					count++;
					
					
				}
			}
			if(count==0) {
				 System.out.println(a[i]);
			}
	}

}}
