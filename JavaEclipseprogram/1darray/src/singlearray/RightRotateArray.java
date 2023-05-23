package singlearray;

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		int last=a[a.length-1];
		
		
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
				
			}
			a[0]=last;
		
		
		
		System.out.println();
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
	}

}
