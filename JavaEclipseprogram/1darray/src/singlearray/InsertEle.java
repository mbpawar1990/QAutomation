package singlearray;

public class InsertEle {
	static void Insert(int a[]) {
		int loc=2,val=56;
		//int size=5;
		System.out.println("The location at which value inserted="+loc);
		System.out.println("value to be inserted="+val);
		for(int i=4;i<loc;i--) {
			a[i]=a[i-1];
		}
		a[loc]=val;
		//size=size+1;
		for(int i=0;i<5;i++)
			System.out.println(a[i]+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]= {10,20,30,5};
		System.out.println("Array elemetns are..");
		for(int i=0;i<4;i++) {
			
			System.out.println(c[i]);

	}
		Insert(c);
	}

}
