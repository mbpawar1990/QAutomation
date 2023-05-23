package exceptionall;

public class Tryfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println(s.length());
		}
finally {
	System.out.println("after try block we used finally without catch block...");
}
		System.out.println("rest ofthe code...");
	}

}
