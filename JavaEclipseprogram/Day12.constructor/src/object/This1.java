package object;
class Z{
	Z(){
		System.out.println("zero parameter constructor..");
	}
	Z(int a){
		this();
		System.out.println("value of a="+a);
	}
}

public class This1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z r=new Z(10);

	}

}
