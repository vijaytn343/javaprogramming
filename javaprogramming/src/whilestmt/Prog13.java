package whilestmt;

public class Prog13 {
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			int prod=1;
			while(rem>0) {
				prod=prod*rem;
				rem--;
			}
			sum=sum+prod;
			num=num/10;
		}
		System.out.println(sum);
	}

}
