package array;

public class minimummove {
	public static void main(String[] args) {
		int []a= {-1,3,0,-2,6};
		int []b=new int[5];
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
