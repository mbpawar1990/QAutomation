package simpleinheritance;
class Demo11{
	void disp() {
		System.out.println("parent class method....");
	}
}
class Demo22 extends Demo11{
	void Disp1() {
		System.out.println("sub class 1 method....");
	}
	
}
class Demo33 extends Demo11{
	void input() {
		System.out.println("sub class 2 method....");
	}
}
public class heirachical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo22 r1=new Demo22();
		r1.disp();
		r1.Disp1();
		Demo33 r2=new Demo33();
		//r2.disp();
		r2.input();

	}

}
