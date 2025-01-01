package whilestmt;

public class Prog5 {
	public static void main(String[] args) {
		int num=123;
		int pro=1;
		int sum=0;
		
	
			
		while(num>0) {
			int rem=num%10;
			pro=pro*rem;
			sum=sum+rem;
			num=num/10;
		}
		//System.out.println(rev);
	if(sum==pro) {
		System.out.println("spy");
	}
	else {
		System.out.println("not");
	}
	}

}
