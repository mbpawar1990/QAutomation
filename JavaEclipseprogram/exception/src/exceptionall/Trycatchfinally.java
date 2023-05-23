package exceptionall;

public class Trycatchfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am finally block....");
		}

	}

}
