package returntype;

public class Prog5 {
	public static void main(String[] args) {
		
		System.out.println(minutes(150));
	}
	public static String minutes(int a) {
		int b=a/60;
		int r=a%60;
		return  "hour"+" "+b+" " +"minutes"+" " +r;
		
	}

}
