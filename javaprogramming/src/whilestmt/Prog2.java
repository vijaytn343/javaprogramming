package whilestmt;

public class Prog2 {
public static void main(String[] args) {
	int num=4567;
	int rev=0;
	while(num>0) {
		int rem=num%10;
		rev=rev+rem;
		num=num/10;
	}
	System.out.println(rev);
}
}
