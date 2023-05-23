package interface1;
interface Draw66{
	void get1();
	default void put1() {
		System.out.println("Default method in netrface..");
	}
}

public class DefaultMethod implements Draw66 {
	public void get1() {
		System.out.println("implements in child class....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Draw66  b=new  DefaultMethod ();
		 b.put1();
		 b.get1();
	}

}
