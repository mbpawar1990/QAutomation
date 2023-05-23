package singlearray;

public class Decendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,20,60,9,1,2,6,3,4,85};
		System.out.println("Array elementsr are...");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}//end of for print
		int j,k ,temp;
		for(int i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]<a[j] ){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}//end of if
				
			}//end of inner for
		}//end of outer for
		System.out.println();
		System.out.println("Array Decending order...");
		for(k=0;k<a.length;k++) {
			
			System.out.print(a[k]+" ");
			
		}
		

	}

}
