package singlearray;

public class LeftRoatate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,30,1,0,15,41,56};
		int first=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=first;
		System.out.println("Left Rotate Array....");
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
