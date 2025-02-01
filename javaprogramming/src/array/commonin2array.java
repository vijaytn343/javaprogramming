package array;

import java.util.Scanner;

public class commonin2array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int size1=scan.nextInt();
		int []b=new int[size1];
		for(int i=0;i<a.length;i++) {
			b[i]=scan.nextInt();
		}
		int count1=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
					count1++;
				}
			}
			if(count>0) {
				System.out.println(a[i]);
			}
		}
		if(count1==0) {
			System.out.println("notfound");
		}
		
	}

}
