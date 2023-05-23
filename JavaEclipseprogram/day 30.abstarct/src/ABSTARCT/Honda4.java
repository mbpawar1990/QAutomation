package ABSTARCT;
abstract class Bike{
	Bike(){
		System.out.println("superclass constrcutor....");
	}
	abstract void Run();//abstract method
}

public class Honda4 extends Bike {
	@Override
	void Run() {
		System.out.println("Running safely....");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Honda4 h=new Honda4();
  h.Run();
  Bike b=new Honda4();//superclass hold subclass property
  b.Run();
	}

}
