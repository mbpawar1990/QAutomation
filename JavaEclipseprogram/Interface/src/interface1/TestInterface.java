package interface1;
interface  Draw{
	void show();
}

class React1 implements Draw {
	
	public void show(){
		System.out.println("Drwaing reactangles....");
	}
}//end of react1
class  circle  implements Draw  {
	 public void show() {
		System.out.println("drawing circles...");
		
	}//end of show
}//end of circle
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw d=new React1();
		d.show();
		

	}

}
