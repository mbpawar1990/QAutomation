package interface1;
interface Print11{
	void show11();
}
interface Display{
	void disp();
}

public class A7 implements Print11,Display {
	public void show11(){
		System.out.println("First interface method...");
		
	}
	public void disp() {
		System.out.println("Second interface method...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 u=new A7();
		u.show11();
		u.disp();

	}

}
