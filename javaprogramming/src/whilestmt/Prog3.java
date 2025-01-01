package whilestmt;

public class Prog3 {
public static void main(String[] args) {
	int num=1234;
	int rev=1;
	while(num>0) {
		int rem=num%10;
		rev=rev*rem;
		num=num/10;
	}
	System.out.println(rev);
}
}

