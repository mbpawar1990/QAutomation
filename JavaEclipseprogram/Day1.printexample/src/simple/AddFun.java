package simple;

public class AddFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddFun D= new AddFun();
		int d=D.Disp(20, 30);
		System.out.println("Addition="+d);

	}
	int Disp(int a,int b)
	{
		System.out.println("Fisrt number="+a);
		System.out.println("Second number="+b);
		int c=a+b;
		return c;
		
	}

}
