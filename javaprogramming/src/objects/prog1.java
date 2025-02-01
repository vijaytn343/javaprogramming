package objects;

public class prog1 {
	
		int sal;
		String  name;
		int a=demo();
		prog1(){
			System.out.println("yes");
		}
		prog1(int a){
			System.out.println(a);
		}
		int b=display();
		{
			System.out.println("true");
		}
		{
			System.out.println("false");
		}
		public int demo() {
			System.out.println("thiru");
			System.out.println(a);
			return 20;
		}
		public int display() {
			System.out.println("vijay");
			System.out.println(a);
			return 10;
	}
		public static void main(String[] args) {
			prog1 obj =new prog1();
			prog1 obj1=new prog1(8);
		}
		
	}


