package returntype;

public class Prog1 {
	public static void main(String[] args) {
	   char res=getChar(65);
	   System.out.println(res);
	}
	public static char getChar(int a) {
		return (char)a;
	}

}
