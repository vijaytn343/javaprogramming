package array;

import java.util.Scanner;

public class Prog15 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter length");
	int size=scan.nextInt();
	
	int[] a=new int[size];
	for (int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	print(a);}

public static void print(int [] a) {
	System.out.println("original array");
	for (int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	}
	int j=a.length-1;
	int temp=0;
	for (int i=0;i<(a.length)/2;i++) {
		if(i==j) {
			break;
		}
		temp=a[i];  
		a[i]=a[j];
		a[j]=temp;
		j--;
		}
	System.out.println("reversed array");
	for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	}
}
