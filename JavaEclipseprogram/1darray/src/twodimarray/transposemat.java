package twodimarray;

public class transposemat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Transpose mat=row --->col
		int a[][]= {{10,20},{30,40}};
		int b[][]= {{50,60},{70,80}};
		/*int len=a.length;
		int len1=b.length;
		int c[][]=new int[len][len1];*/
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
				
	
	
	
	
	}

}
