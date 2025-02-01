package forloop;



public class Prog11 {
public static void main(String[] args) {//fibonacci number from 100 to 1000
	
	int num1=0;
	int num2=1;
	int i=1;
	while(i>0) {
		int num3=num1+num2;
		num1=num2;
		num2=num3;
		if(num3>100&&num3<1000) {
			System.out.println(num3);
		}
		else if(num3>1000) {
			break;
		}
		i++;
	}
}
}
