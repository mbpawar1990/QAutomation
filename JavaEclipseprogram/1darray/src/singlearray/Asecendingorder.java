package singlearray;

public class Asecendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] s= {10,50,63,01,2,9,86,6};
		System.out.println("Array elements are...");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		int temp;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]>s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				
			}//end of inner for
			
		}//end of outer ofr
		System.out.println();
		System.out.println("Array sort elementsr...");
		for(int k=0;k<s.length;k++) {
			System.out.print(s[k]+" ");
		}
		

	}

}
