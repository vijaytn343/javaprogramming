package forloop;

public class Prog13 {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int i=1;
		while(i>0) {
			int num3=1;
			
			if(num3<5000) {
				
				for(int j=1;j<5000;j++) {
					for(int k=1;k<=j;k++) {
						int count=0;
						if(num3%k==0) {
							count++;
						}
						if(count==2) {
							System.out.println(num3);
						}
						
						
					}
					num3=num1+num2;
					num1=num2;
					num2=num3;
					
					
					
				}
			}
				
			else if(num3>5000) {
				break;
			}
			i++;
		}
				
			}
	}
				
			
			
	


