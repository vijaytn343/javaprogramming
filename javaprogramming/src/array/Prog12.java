package array;

import java.util.Scanner;

public class Prog12 {
	public static void main(String[] args) {//difference of maximum and minimum value
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int temp=a[0];
		
		for (int i=1;i<a.length;i++) {
			if(temp>a[i]) {
				
				temp=a[i];
			}
			
		}
		int temp1=a[0];
		
		for (int i=1;i<a.length;i++) {
			if(temp1<a[i]) {
				
				temp1=a[i];
			}
			
		}
		System.out.println("difference"+(temp1-temp));

}}
