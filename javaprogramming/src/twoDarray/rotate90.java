package twoDarray;

import java.util.*;

public class rotate90 {
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
		System.out.println(Arrays.deepToString(a));
		int [][]b =new int [col][row];
		for(int i=0;i<col;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=a[j][i];
			}
		}
		System.out.println(Arrays.deepToString(b));
		for(int i=0;i<row;i++) {
		
			int first=0;
			int last=b[i].length-1;
			while(last>first) {
				int temp=b[i][first];
				b[i][first]=b[i][last];
				b[i][last]=temp;
				first++;
				last--;
			}
		}
		System.out.println(Arrays.deepToString(b));
		
	}

}
