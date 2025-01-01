package methodoverloading;

public class Prog1 {
	public static void main(String[] args) {
		double res=area(5);
		double res1=area(5,7);
		double res2=area(6.0);
		double res3=area(8.0,6.0);
		System.out.println(" square:"+ res);
		System.out.println("rectangle:"+res1);
		System.out.println("circle:"+res2);
		System.out.println("triangle:"+res3);
	}
	public static double area(int a,int b) { 
		return a*b;
		
	}
	public static int area(int a) {
		return  a*a;
		
	}
	public static double area(double a,double b) {
		return (0.5*a*b);
		
	}
	public static double area(double a) {
		return(3.14*a*a);
	
}

	

}
