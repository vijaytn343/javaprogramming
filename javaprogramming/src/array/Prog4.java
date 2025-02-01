
package array;

import java.util.Scanner;

public class Prog4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter length");
	int size=scan.nextInt();
	int b=size/2;
	int sum=0;
	int[] a=new int[size];
	for (int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	for(int i=0;i<b;i++) {
		System.out.println(a[i]);
	}
	for (int i=b;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
	
}
}
