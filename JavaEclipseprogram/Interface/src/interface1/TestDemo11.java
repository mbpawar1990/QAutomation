package interface1;
interface A22{
	void get();
}
interface B11 extends A22{
	void put();
}

public class TestDemo11 implements B11 {
	public void get() {
		System.out.println("parent method inetrface...");
		
	}
public void put() {
	System.out.println("child interface method...");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo11 i=new TestDemo11();
		i.get();
		i.put();

	}

}
