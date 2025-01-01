package returntype;

public class Prog4 {
public static void main(String[] args) {
	System.out.println(demo('a'));
	System.out.println(demo(90));
	//System.out.println(demo('67'));
}public static int demo(char a) {
	System.out.println("char");
	return a;
}
public static double demo(int a) {
	System.out.println("int");
	return a+1;
}
}
