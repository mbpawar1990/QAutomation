package constvarmethod;
class Var11{
	int a=30;
	void disp() {
		System.out.println("parent class method....");
	}
}
class var22 extends Var11{
	int a=50;
	void disp() {
		System.out.println("value of a in parent class="+super.a);
		System.out.println("value of a in child class="+a);
		System.out.println("call parent class method..");
		super.disp();
	}
}

public class var1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var22 v=new var22();
		v.disp();

	}

}
