package twodimarray;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,20,30},{40,10,20}};
		int b[][]= {{45,10,63},{20,15,30}};
		int len=a.length;
		int len1=b.length;
		int c[][]=new int[len][len1];
		System.out.println("Addition");
		System.out.println();
		for(int i=0;i<len;i++) {
			
				for(int j=0;j<len1;j++) {
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
	
		}

	}


