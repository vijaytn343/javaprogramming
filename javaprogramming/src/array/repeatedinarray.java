package array;

import java.util.Scanner;

public class repeatedinarray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int value=a.length/2;
		int b=print(a,value);
		System.out.println(b);
		}
		
		public static int print(int []a,int value) {
			int count1=1;
			for(int i=0;i<a.length;i++) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
				}
				if(count>value) {
					System.out.println(a[i]);
					return a[i];
			}
		}
			
				return -1;
			
			
	}

}
