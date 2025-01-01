package methodoverloading;

public class Prog2 {
public static void main(String[] args) {
	m1(10);
}
public static void m1(char ch) {
	System.out.println(ch);
}
public static void m1(int a) {
	System.out.println(a);
}
}
