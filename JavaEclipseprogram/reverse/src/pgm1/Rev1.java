package pgm1;

public class Rev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,r;
		System.out.println("Prgram of reverse no...");
		System.out.println("Original number="+n);
		
		while(n>0) {
			r=n%10;//get remainder as a reverse
			System.out.print(r);
			n=n/10;//to obatin next digit

	}//end of while

}//end of main

}//end of class

