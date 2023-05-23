package twodimarray;

public class LowerTriangularMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("Array matrix is......");
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Lower triangular matrix...");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				if(i>j) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
		System.out.println();
		System.out.println("upper triangular matrix...");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				if(j>i) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
		
		}

	}


