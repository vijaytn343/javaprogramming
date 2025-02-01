package whilestmt;

public class Prog14 {
	public static void main(String[] args) {
		int num=1382;
		
		while(num>9) {
			
			int prod=1;
		
			while(num>0){
				int rem=num%10;
				prod=prod*rem;
				num=num/10;
			}
			num=prod;
		}
		
		
		System.out.println(num);;
	}

}
