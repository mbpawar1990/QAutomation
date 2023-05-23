package simplefor1;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) { 
			
			   for (int j=6;j>=i;j--) {
				   System.out.println("*");
				   //System.out.println();
				   
			   }//end of inner for
			
		}//outer for end

	}

}
