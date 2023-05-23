package singlearray;

public class EvenEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] d= {10,52,63,17,86,96,1,3,9};
		System.out.println("Array Elements are...");
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
			
		}//end of for print
		System.out.println();
		System.out.println("Array even elements are....");
		for(int j=0;j<d.length;j++) {
			if(d[j]%2==0) {
				System.out.print(d[j]+" ");
			}//end of if
		}//end of for

	}

}
