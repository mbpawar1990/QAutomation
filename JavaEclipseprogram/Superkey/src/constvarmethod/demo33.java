package constvarmethod;
class Z1{
	int a,b;
	Z1(){
		a=20;
		b=30;
		System.out.println("parent class....");
	}
}
class Z2 extends Z1{
	int c;
	/*Z2(){
		c=a+b;
		System.out.println("Addition="+c);
	}*/
	void Disp33() {
		System.out.println("value of c="+c);
	}
	}
	

public class demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z2 j=new Z2();
		j.Disp33();
		

	}

}
