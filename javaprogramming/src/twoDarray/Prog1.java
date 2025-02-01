package twoDarray;

public class Prog1 {
	public static void main(String[] args) {
		int [][]a= {{3,2},{4,1,5},{5,8}};
		print(a);
	}
	public static void print(int [][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
