package decision;
import java.util.Scanner;
public class Prog8 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter currentyear:");
	int curYear=scan.nextInt();
	System.out.println("enter joinedyear:");
	int joinYear=scan.nextInt();
	System.out.println("enter basic salary");
	double basicSalary=scan.nextDouble();
	//gras( curYear, joinYear,basicSalary);
	Prog8 obj=new Prog8();
	obj.gras(curYear, joinYear, basicSalary);
	scan.close();
}
public  void gras(int cur,int join,double basic) {
	if(cur-join>3) {
		if(basic<=10000) {
		System.out.println("grass salary:"+(basic+0.2*basic+0.8*basic+2500));
		
	}else if(basic<=20000) {
		System.out.println("grass salary:"+(basic+0.25*basic+0.9*basic+2500));
	}else if(basic>20000) {
		System.out.println("grass salary:"+(basic+0.3*basic+0.95*basic+2500));
	}
		}
	else {
		if(basic<=10000) {
			System.out.println(basic+0.2*basic+0.8*basic);
			
		}else if(basic<=20000) {
			System.out.println(basic+0.25*basic+0.9*basic);
		}else if(basic>20000) {
			System.out.println(basic+0.3*basic+0.95*basic);
		}
		
	}
}
}
