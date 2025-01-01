package switchstmt;
import java.util.Scanner;
public class Prog5 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a:");
	int a=scan.nextInt();
	System.out.println("enter b:");
	int b=scan.nextInt();
	System.out.println("enter operat:");
	char oper=scan.next().charAt(0);
	switch(oper) {
	case '+':{
		System.out.println(a+b);
		break;
		}
	case '-':{System.out.println(a-b);break;
	}
	case '*':System.out.println(a*b);
			break;
	case '/':
		
		
		
System.out.println(a/ b);
	//default: System.out.println("enter valid oper");
	}
	scan.close();
	}
	
}

