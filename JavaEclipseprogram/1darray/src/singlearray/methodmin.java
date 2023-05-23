package singlearray;

public class methodmin {
	static void min(int arr[]) {
		int min=arr[0];
		for (int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				System.out.println(min);
			}//end if
		}//end of for
	}//end of min

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		int c[]= {53,12,63};
		min(c);

	}

}
