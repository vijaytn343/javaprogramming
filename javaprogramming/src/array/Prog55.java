package array;

import java.util.Scanner;

public class Prog55 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		int max=a.length/2;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					count++;
				}
			}
			if(count>max) {
				System.out.println(a[i]);
				break;
			}
		}
		System.out.println(1);
		//System.out.println(max);
	}

}
