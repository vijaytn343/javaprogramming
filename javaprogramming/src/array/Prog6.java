package array;

import java.util.Scanner;

public class Prog6 {//to find minimum value;
public static void main(String[] args) {
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
	
		System.out.println(temp);
	
}
}
