package Ass1;
class A{
	int i=50;
	    A(){
		i=20;
		System.out.println("Deafult constructor......");
		System.out.println("Value of i="+ i);
		
	}
	    A(int x){
	    	i=x;
	    	System.out.println("value of i="+x);
	    }
	    void Disp() {
	    	System.out.println("value of i="+i);
	    }
}

public class Cons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A A1=new A();
  A1.Disp();
  A A2=new A(30);
  A2.Disp();
  

	}

}
