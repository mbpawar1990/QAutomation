package finalvar;
class Simple1{
	final int a;
	final static double z;
	static {
		z=50.369;
		System.out.println("static final var is initializedin static block.."+z);
	}
	Simple1(){
		a=20;
	}
	void disp() {
		System.out.println("Non static final var assigend in constructor.."+a);
	}
}
public class Nonstaticvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple1 s=new Simple1();
		s.disp();
	}

}
