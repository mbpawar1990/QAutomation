package object;
class A5{
	Thisconst obj;
	A5(Thisconst obj){
		this.obj=obj;
	}
	void disp() {
		System.out.println(obj.data);
	}
}

public class Thisconst {
	int data=10;
	Thisconst(){
		
		A5 b=new A5(this);
		b.disp();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thisconst a=new Thisconst();
		
		

	}

}
