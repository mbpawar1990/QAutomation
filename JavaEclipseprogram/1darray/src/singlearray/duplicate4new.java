package singlearray;

import java.util.HashSet;
import java.util.Set;


public class duplicate4new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,4,3,2,2,1};
		System.out.println("Duplicate array numbers are..");
		Set<Integer> s=new HashSet<>();
		for(int no:a) {
			if(s.add(no)==false) {
				System.out.print(no+ " ");
			}
		}

	}

}
