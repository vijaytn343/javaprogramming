package array;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int []a=new int [size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			if(count>0&&a[i]!=Integer.MAX_VALUE) {
				System.out.println(a[i]);
			}
		}
		
		
		
	}

}
