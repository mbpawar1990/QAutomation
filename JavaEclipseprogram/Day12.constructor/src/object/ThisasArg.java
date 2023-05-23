package object;
class S2{
	void m(S2 obj) {
		System.out.println("Method is invoked...");
	}
	void p() {
		m(this);
	}
}

public class ThisasArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S2 S1=new S2();
		S1.p();

	}

}
