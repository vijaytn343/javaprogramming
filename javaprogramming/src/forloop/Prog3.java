package forloop;

import java.util.Scanner;

public class Prog3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 3 digit number:");
	int a=scan.nextInt();
	int first=a/10;
	int last=a%10;
	int value=0;
	while(first>0) {
		int rem=first%10;
		value=value+rem;
		first=first/10;
		
	}
	//System.out.println(value);
	//System.out.println(last);
  if (value==last) {
	  System.out.println("sum of first two is = last digit");
  }
  else {
	  System.out.println("not");
  }
  scan.close();
}
}
