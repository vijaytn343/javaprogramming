package array;

import java.util.Scanner;

public class missingelement {
	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enter size");
			int size=scan.nextInt();
			System.out.println("enter elements");
			int[] a=new int[size];
			for(int i=0;i<a.length;i++) {
				a[i]=scan.nextInt();
				
			}
		
			
			int max=max(a);
			int min=min(a);
			
			missing(a,max,min);
			
			
			
		}
		public static void print(int [] a) {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			
		}
		public static int max(int[] a) {
			int max=a[0];
			for(int i=0;i<a.length-1;i++) {
				
					if(max<a[i]) {
						max=a[i];
					
					
				}
			}
			return max;
		
	}
		public static int min(int[] a) {
			int min=a[0];
			for(int i=0;i<a.length-1;i++) {
				
					if(min>a[i]) {
						min=a[i];
					
					
				}}
			
			return min;}
		public static void missing(int[] a,int max,int min) {
			for(int i=min;i<max;i++) {
				int count=0;
				for(int j=0;j<a.length;j++) {
					if(i==a[j]) {
						count++;
					}
					
				}
				if(count==0) {
					System.out.println(i);
				}
			}
			
		}
		
	}

