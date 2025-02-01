package array;

public class Prog2 {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	System.out.println(average(a));
}
public static int average(int[] a) {
	int sum=0;
	for (int i=0;i<a.length;i++) {
		 
			sum=sum+a[i];
			}
	return sum/a.length;
}
}
