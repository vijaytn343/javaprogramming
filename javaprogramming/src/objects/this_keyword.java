package objects;

public class this_keyword {
	int a=30;
	public void display() {
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		this_keyword obj2=new this_keyword();
		System.out.println(obj2.a);
	}
	

}
