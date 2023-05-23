package singlearray;

public class ThirdLargestEle {

	public static int third(int a[],int b)
	{
		int temp=0;
		for(int i=0;i<b;i++) {
			for(int j=0;j<b;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[b-3];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,4,0,50,63,86,45,12};
		int b=a.length;
		System.out.println("Length of array="+b);
		System.out.println("Third largest Elements is="+third(a,b));

	}

}
