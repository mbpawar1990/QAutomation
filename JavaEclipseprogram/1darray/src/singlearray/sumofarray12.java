package singlearray;

public class sumofarray12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a[]= {10,20,50,80,45,0,62};
		System.out.println("Array Elements are...");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		
		for(int j=0;j<a.length;j++) {
			sum=sum+a[j];
		}
		System.out.println(); 
		System.out.println("Arrays sum ="+sum);

	}

}
