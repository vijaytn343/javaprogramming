package forloop;
//import java.util.Scanner;
public class Prog10 {// sum of first 30 prime numbers
public static void main(String[] args) {
	int sum=0;
	int number=0;
	for (int i=1;i>0;i++) {
		int count=0;
		for (int j=1;j<i;j++) {
			if(i%j==0) {
				count++;
			}
			
			}
		if(count==1) {
			System.out.println(i);
			sum=sum+i;
			number++;}
			
			
		if(number==30) {
			break;
		}
	
	}
	
	
	System.out.println(sum);
}}
