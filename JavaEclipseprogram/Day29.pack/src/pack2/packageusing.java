package pack2;
import pack1.*;

public class packageusing extends publicclass2{
	void show3() {
		System.out.println("pack1 member class used in pack2");
	}
	public static void main(String []args) {
		 packageusing u=new  packageusing();
		 u.show3();
		 u.show();
		 u.show1();
		 
		
	}

}
