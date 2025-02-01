package decision;

import java.util.Scanner;

public class Prog10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		check(a);
	}
	public static void check(double a) {
		if(a>=2&&a<3) {
			System.out.println("highly efficiently");
		}
		else if(a>=3&&a<=4) {
			System.out.println("improve needed");
		}
		else if(a>=4&&a<5) {
			System.out.println("training reqiured");
		}
		else{
			System.out.println("get out of company");
		}

}}
