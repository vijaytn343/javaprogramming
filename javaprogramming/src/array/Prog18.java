package array;

import java.util.Scanner;

public class Prog18 {///array sort between two index;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		int size=scan.nextInt();
		System.out.println("enter elements");
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
		System.out.println("enter last:");
		int last=scan.nextInt();
		System.out.println("enter first");
		int first =scan.nextInt();
		System.out.println("before Swapping");
		print(a);
		bubble(a,last,first);
		System.out.println("after swapping");
		print(a);
		
	}
	public static void print(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void bubble(int[] a,int last,int first) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=first;j<last;j++) {
				
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					
					
					
				}
				
			}
		}
		System.out.println("-------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
