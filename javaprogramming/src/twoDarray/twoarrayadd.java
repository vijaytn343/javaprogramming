package twoDarray;

import java.util.Scanner;

public class twoarrayadd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter row size");
		int row=scan.nextInt();
		System.out.println("enter col size");
		int col=scan.nextInt();
		int [][]a=new int[row][col];
		System.out.println("enter elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				a[i][j]=scan.nextInt();
				//System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("A matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.print(a[i][j]+" ");
				//System.out.print(" ");
			}
			System.out.println();
		}
		int row1=scan.nextInt();
		int col1=scan.nextInt();
		int [][]b=new int[row1][col1];
		System.out.println("enter elments");
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				b[i][j]=scan.nextInt();
				//System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("B matrix");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	
		int [][]c=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col1;j++) {
				for(int k=0;k<row1;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				
				//System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println(" added matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col1;j++) {
				System.out.print(c[i][j]+" ");
				//System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
