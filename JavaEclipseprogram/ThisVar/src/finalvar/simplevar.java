package finalvar;

public class simplevar {
	final int a=10;
	void disp() {
		//a=a+30;
		int s=a*a*a;
		System.out.println("value of a="+a);
		System.out.println("we perform arithmatic operation="+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simplevar s=new simplevar();
		s.disp();
	}

}
