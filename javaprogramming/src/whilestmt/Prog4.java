package whilestmt;

public class Prog4 {
	public static void main(String[] args) {
		int num=56;
		int c=palindrome(num);
		if(c==num) {
			System.out.println("palindrome");
			
		}
		else {
		
		
			System.out.println("not palindrome");
		}
		}
		public static int palindrome(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
		}
	

}

