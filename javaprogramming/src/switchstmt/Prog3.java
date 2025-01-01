package switchstmt;
import java.util.Scanner;
public class Prog3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter char");
	char ch=scan.next().charAt(0);
	if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='O') {
			
			System.out.println("vowel");
		}
		else {
			System.out.println("not vowel");
		}
	}
	else if(ch>='0'&&ch<='9') {
		System.out.println("not vowel");
	}
	else {
		System.out.println("not vowel");
	}
	scan.close();
}
}
