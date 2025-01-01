package returntype;

public class Prog3 {
	public static void main(String[] args) {
	  int a=(prefix(101));
	  String b=prefix1("accenture");
	  String res=b+a;
	  System.out.println(res);
	  
	}
	public static int prefix(int  a) {
		return a;
	}
	public static String prefix1(String b) {
		return b;
	}

}
