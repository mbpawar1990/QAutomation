package singlearray;

public class RemoveEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,40,30,80,60,20};
		int del=40;
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			 if(del==a[i]) {
				 for(int j=i;j<a.length-1;j++) {
					 a[j]=a[j+1];
				 }//end of inner for
				 cnt++;
				 break;
				 
			 }//end of if
		}//end of for
		if(cnt==0) {
			System.out.println("Element not found....");
		}else
		{
			System.out.println("Element deleted ..."+del);
			for(int i=0;i<a.length-1;i++) {
				System.out.print(a[i]+" ");
			}//end of for
		}//end of else

	}//end of main

}
