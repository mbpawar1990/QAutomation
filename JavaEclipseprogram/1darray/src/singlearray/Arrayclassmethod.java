package singlearray;

import java.util.Arrays;

public class Arrayclassmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,30,40,50};
		System.out.println("to string method="+Arrays.toString(a));
		System.out.println("As list method="+Arrays.asList(a));
		String c[]= {"Hello","Coding"};
		System.out.println("As list method="+Arrays.asList(c));
		int [] b[]= {{10,30,20},{40,50,60}};
		System.out.println("Deep to stringmethod="+Arrays.deepToString(b));
		
		

	}

}
