package array;

import java.util.Scanner;

public class sumofmaxsub {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		
		int[] a=new int[size];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int target=scan.nextInt();
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
		
						sum=sum+a[k];
					
				}
				if(sum==target) {
					for(int l=i;l<=j;l++) {
						System.out.println(a[l]);
					}
				}
				System.out.println();
			}
			//System.out.println();
			}

}}
