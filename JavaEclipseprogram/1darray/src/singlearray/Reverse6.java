package singlearray;

public class Reverse6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,60,90,50,30,70};
		System.out.println("Array elementsare...");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse array elements are...");
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}

	}

}
