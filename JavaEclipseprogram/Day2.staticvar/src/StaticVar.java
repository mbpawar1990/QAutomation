
public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=AddVar(20,30);
		System.out.println("Addition="+c);
		int e=getChar('A');
		System.out.println("Ascii value of A="+e);
		StaticVar.Modval(30,60);
		StaticVar.Swapp(20, 30);
		}
	static int AddVar(int a,int b) {
		System.out.println("The first no="+a);
		System.out.println("The second no="+b);
		int res=a+b;
		return res;
	}
static int getChar(char c) {
	int d=c;
	return d;
	}
static void Modval(int a,int b) {
	System.out.println("First no="+a);
	System.out.println("Second no="+b);
	double res=a%b;
	System.out.println("Remainder="+res);
	int res1=b/a;
	System.out.println("Quetiont="+res1);
	}
static void Swapp(int a,int b) {
	System.out.println("Before swapping number 1="+a);
	System.out.println("Before swapping number2="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping number a="+a);
	System.out.println("After Swapping number b="+b);
}
}
