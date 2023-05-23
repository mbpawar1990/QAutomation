class GlobalVarStatic
{
	static char a='a';
	static int b=20;
	public static void main(String[] args) 
	{
		System.out.println("value of a="+a);
		System.out.println("value of a="+GlobalVarStatic.a);
		System.out.println("Value of b="+b);
		b=b+10;//after value change
		System.out.println("Value of b ="+GlobalVarStatic.b);

	}
}
