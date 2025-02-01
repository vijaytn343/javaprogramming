package array;

import java.util.Scanner;

public class Prog10 {//second half avg
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int size=scan.nextInt();
		
		int[] a=new int[size];
		for (int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		print(a,size);}
	
	public static void print(int [] a,int size) {
		int b=size/2;
		int c=(a.length)-b;
		int sum=0;
		for (int i=b;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum/c);
		
		
	
	
	
}

}
