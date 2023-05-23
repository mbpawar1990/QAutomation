package starpattern;

public class topdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print("*");
				
			}//inner j
			System.out.println();
		}//outer j
		
		System.out.println("********************************************");
for(i=1;i<=5;i++) {
			
			for(j=5;j>=i;j--) {
				System.out.print("*");
				
			}//inner j
			System.out.println();
		}//outer j

	}

}
