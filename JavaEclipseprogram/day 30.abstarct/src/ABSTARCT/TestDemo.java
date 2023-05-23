package ABSTARCT;
abstract class Test55{
	   Test55(){
		System.out.println("Super class constructor....");
	}
	   abstract void Dev();
	   abstract void Rank();
}
abstract class Test66 extends Test55{
	@Override
	void Dev()//only one method override........so class become abstarct
	{
		System.out.println("HTML..");
	}
	
}

public class TestDemo extends Test66 {
	void Rank() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      Test55 t=new TestDemo();
            t.Dev();
           t.Rank();
	}

}
