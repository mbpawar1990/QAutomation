package object;
class A{
	int a,b;
	A(){};
	A(int x,int y){
		a=x;
		b=y;
	}
	A(A r){
		a=r.a;
		b=r.b;
	}
	void Disp() {
		System.out.println(a+ "\t"+b);
	}
}

public class CopyValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A A1=new A(10,20);
		A A2=new A(A1);
		A1.Disp();
		A2.Disp();
		A A3=new A();
		A3.a=A2.a;
		A3.b=A2.b;
		A3.Disp();
		

	}

}
