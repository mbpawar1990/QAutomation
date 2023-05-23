package exceptionall;

public class Multiplectach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
String s=null;
System.out.println(s.length());

	}
catch(ArithmeticException e) {
	System.out.println(e);
}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
}
}
