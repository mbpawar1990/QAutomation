class  NonStaticVar
{
	int a;
	static int b=30;
	public static void main(String[] args) 
	{
		System.out.println("value of b without calling classname="+b);//static var called in static method
		System.out.println("value of b with classname="+NonStaticVar.b);//static var called using classname
		NonStaticVar A=new NonStaticVar();//object creation for called instance var
		A.a=A.a+10;//modified using object name
		System.out.println("instance variable a using object name="+A.a);
		NonStaticVar B=new NonStaticVar();
		B.a=B.a+60;
		System.out.println("instance variable a using object name in B="+B.a);//default memory given

	}
}
