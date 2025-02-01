package forloop;

//import java.util.Scanner;

public class Prog9 {//first 20 prime numbers  
	public static void main(String[] args) {
		int number=0;
		for (int i=1;i>0;i++) {
			int count=0;
			for (int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
				}
			if(count==2) {
				System.out.println(i);
				number++;}
				if(number==20) {
					i=0;
				
				
			}
		}
	}

}
