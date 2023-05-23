package object;
class Hello{
	Hello getHello() {
		return this;
	}
	void msg(){
		
		System.out.println("Hello Java...");
	}
}

public class CurrentInst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hello().getHello().msg();

	}

}
