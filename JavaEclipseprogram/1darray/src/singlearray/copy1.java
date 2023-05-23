package singlearray;

public class copy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,6,0};
		int b[]=new int[7];
	System.out.println("Elements in first array...");
	for (int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Second arrays  elements...");
	for(int j=0;j<a.length;j++) {
		b[j]=a[j];
		System.out.print(b[j]+" ");
	}

	}

}
