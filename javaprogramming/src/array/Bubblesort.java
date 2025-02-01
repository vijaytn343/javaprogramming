package array;

public class Bubblesort {
	public static void main(String[] args) {
		int [] a= {5,3,8,2,1};
		
		for(int i=0;i<a.length-1;i++) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
		}for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	}

}
