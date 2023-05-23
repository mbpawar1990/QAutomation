package singlearray;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={10,20,5,4,63,89,56};
		int large=0;
		int secondlarge=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>large) {
				secondlarge=large;
				large=a[i];
			}else if(a[i]>secondlarge) {
				secondlarge=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Second largest Array Elements is="+secondlarge);
/*int b=Integer.MIN_VALUE;
System.out.println(b);*/
	}

}
