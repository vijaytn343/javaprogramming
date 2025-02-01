package twoDarray;

import java.util.Scanner;

public class rowaddiction {
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
		
		int j=0;
		while(j<col) {
			int sum=0;
			int i=0;
			while(i<row){
				sum=sum+a[i][j];
				i++;
			}
			System.out.println(sum);
			j++;
		}
		
	}

}
