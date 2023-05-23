package simple;

public class FinalVar {
	final double PI=3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVar V=new FinalVar();
		V.Disp();

	}
	void Disp()
	{
		double rad=3.6;
		System.out.println("Radious of circle="+rad);
		double res =PI*rad*rad;
		System.out.println("Area of circle="+res);
		
	}

}
