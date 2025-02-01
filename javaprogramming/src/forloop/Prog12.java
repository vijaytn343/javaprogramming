package forloop;

public class Prog12 {
public static void main(String[] args) {
	

int num1=0;
int num2=1;
int i=1;
while(i>0) {
	int num3=num1+num2;
	num1=num2;
	num2=num3;
	if(num3>500&&num3<5000) {
		System.out.println(num3);
	}
	else if(num3>5000) {
		break;
	}
	i++;
}}}