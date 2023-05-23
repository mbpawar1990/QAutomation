package object;
class A4{
	int a;
	double b;
	String z;
	A4(){
		a=100;
		b=20.36;
		z="Default";
	}
	A4(int a){
		this.a=a;
	}
	A4(double b,String z){
		this.b=b;
		this.z=z;
	}
	
}

public class OerloadingCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 A1=new A4();
		System.out.println("Value using default constructor.");
		System.out.println(A1.a+"\t"+A1.b+"\t"+A1.z);
		A4 A2=new A4(10);
		System.out.println("Using single parameter value..");
		System.out.println(A2.a);
		A4 A3=new A4(26.396,"Oerloading");
		System.out.println(A3.b+"\t"+A3.z);

	}

}
