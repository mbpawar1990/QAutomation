package starpattern;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print(j+"\t");
				
			}//inner j
			System.out.println();
		}//outer i
		System.out.println("------------------------------------>");
     for(i=1;i<=5;i++) {
			
			for(j=5;j>=i;j--) {
				System.out.print(j+"\t");
				
			}//inner j
			System.out.println();
		}//outer i 
		

	}

}
