package twodimarray;

public class sparsemat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{0,0,1},{5,1,0},{9,2,3}};
		System.out.println("Array is...");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
  int zero=0,totalele=0;
  for(int i=0;i<a.length;i++) {
	  for(int j=0;j<a[i].length;j++) {
		  if(a[i][j]==0) {
			  zero++;
			   totalele=a.length*a[0].length;
		  }
		  
	  }
  }
int ele=totalele/2;
  if(zero > ele) {
	  System.out.println(" SParse mat...");
  }else
  {
	  System.out.println("not sparsemat");
  }
	}

}
