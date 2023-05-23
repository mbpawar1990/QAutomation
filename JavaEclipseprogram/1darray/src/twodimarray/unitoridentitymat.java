package twodimarray;

public class unitoridentitymat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,0,0},{0,1,0},{0,1,0}};
		System.out.println("Array alues are...");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int f=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(i==j && a[i][j]==1) {
					f=1;
					break;
				}else if(i!=j && a[i][j]==0) {
					f=0;
					break;
				}
					
				
			}
		}
if(f==1) {
	System.out.println("matrix is unit matrix");
}else
{
	System.out.println("matrix is  not unit matrix....");
}
	}

}
