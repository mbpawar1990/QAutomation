package simpleinheritance;
class X{
	int a=50;
	void disp() {
		System.out.println("value of a="+a);
	}
}
class Y extends X{
	int b=60-a;
	void Disp1() {
		System.out.println("value of b in sub class="+b);
	}
}

public class TestDemo22 extends Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo22 u=new TestDemo22();
		u.disp();
		u.Disp1();
		System.out.println("Addition of parents class variable is="+(u.a+u.b));
		
	}

}
