package twodimarray;

public class subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] []= {{10,20},{30,40}};
		int b[] []= {{50,60},{70,80}};
		int c[][]=new int[a.length][b.length];
		System.out.println("Subtraction....");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				c[i][j]=b[i][j]-a[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
