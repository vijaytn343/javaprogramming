package array;
import java.util.*;

public class Prog16 {
	public static void main(String[] args) {
		int []a= {4,5,7,8,9};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[a.length-1]==1) {
				max=0;
			}
			
			for(int j=i;j<a.length;j++) {
				if(a[j]-a[i]>max) {
					max=a[j]-a[i];
				}
			}
		}
		System.out.println(max);
		
	}

}
