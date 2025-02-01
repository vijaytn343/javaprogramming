package twoDarray;

import java.util.Scanner;

public class tranpose_array {
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
		int [][]b=new int[row][col];
	
		for(int i=0;i<row;i++) {
		
			for(int j=0;j<col;j++) {
				
				
				b[j][i]=a[i][j];
				//System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("tranpose  matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
