package whilestmt;

public class Prog6 {
public static void main(String[] args) {
	int num=121;
	int rev=0;
	while(num>0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	 if(num!=0){
			System.out.println(rev);
			System.out.println(num);
			
		}
		else {
			System.out.println("not palindrome");
		}
}
}
