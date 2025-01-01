package whilestmt;

public class Prog9 {
	public static void main(String[] args) {
		char ch='A';
		
		while(ch<='z') {
			if(ch==91) {
				
				ch='a';
			}
			System.out.println(ch+":"+(int)ch);
			ch++;
		}

}
}
