package singlearray;

public class SmallArrayEle {
	static void small(int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Smallest element in array="+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,63,52,48,96,12};
		System.out.println("Array elements are...");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		small(a);
		

	}

}
