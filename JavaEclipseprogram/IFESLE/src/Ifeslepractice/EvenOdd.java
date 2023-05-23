package Ifeslepractice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter value of a=");
		a=obj.nextInt();
		//System.out.println("Value of a="+a);
		if(a%2==0) {
			System.out.println("A is even number"+a);
		}
		else {
			System.out.println("A is odd number="+a);
		}
		System.out.println("Simple pgm of even and odd");

	}
	 
}
