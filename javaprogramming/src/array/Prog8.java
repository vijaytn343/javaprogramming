package array;

import java.util.Scanner;

public class Prog8 {
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
				int temp=a[0];
				
		
		for (int i=1;i<(a.length)/2;i++) {
			if(temp<a[i]) {
				
				temp=a[i];
			}
			
		}
		
			System.out.println("largest value in first half is:"+temp);
	}

}
