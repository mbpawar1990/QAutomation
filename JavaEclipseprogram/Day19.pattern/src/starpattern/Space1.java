package starpattern;

public class Space1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j ,k;
		for(i=1;i<=5;i++) {
			
			for(j=i;j<5;j++) {
				System.out.print(" ");
				
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------->");
for(i=1;i<=5;i++) {
			
			for(j=i;j<5;j++) {
				System.out.print(" ");
				
			}
			for(k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
