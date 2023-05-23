package simpleinheritance;
class A{
	int a=30;
	void Disp() {
		System.out.println("value of a in super class="+a);
	}
}
class B extends A{
	int b=30+a;
	void Disp1() {
		super.Disp();//call super class method in sub class
		System.out.println("value of b="+b);
	}
}

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.Disp1();
		b.Disp();//call super class method

	}

}
