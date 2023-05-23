package singlearray;

public class BigArrayEle {
	static void big(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Biggest array elements is="+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {10,23,5,96,45,10,25};
		System.out.println("Array elemnts are...");
		for(int j=0;j<b.length;j++)
			System.out.print(b[j]+" ");
		System.out.println();
		big(b);

	}

}
