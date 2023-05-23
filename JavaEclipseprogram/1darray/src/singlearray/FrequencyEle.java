package singlearray;

public class FrequencyEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,1,5,6,2,4,3};
		int key=2,cnt=0;
		System.out.println("Enter value to be searched="+key);
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				cnt=cnt+1;
				
			}
		}
		System.out.println("frequency of elements is key ="+key+ "\t "+" "+cnt);
		

	}

}
