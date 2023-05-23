package Ifeslepractice;

public class largerOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		if(a>b) {
			    if(a>c) {
				System.out.println("a is greater number="+a);
			     }    else {
				System.out.println("c is greater number="+c);
			   }
		}//outer if
		else {
			     if(b>c) {
				System.out.println("b is greater number="+b);
			     }// end of if
			   else {
				System.out.println("c is greater number="+c);
			    }
		   }//end of else

	}//end of main

}//end of class
