package interface1;
interface print1{
	int a=10;
	void print();
}

public class A6 implements print1 {
	static int b= a+30;
	//a=40;
	
public void print() {
	System.out.println("value of interface variable="+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 t=new A6();
		t.print();
		System.out.println("value of class variable="+b);

	}

}
