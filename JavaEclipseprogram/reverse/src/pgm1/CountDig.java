package pgm1;

public class CountDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,cnt=0;//cnt is used to count digit
		System.out.println("number..."+n);
		while(n>0) {
			n=n/10;
			cnt++;
			
		}//end of while
System.out.println("Digit in number="+cnt);
	}//end of main

}//end of class
