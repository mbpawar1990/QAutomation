package singlearray;

public class ArrayfromMethod {
	static int [] get() {
		return new int [] {10,20,30};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[]=get();
		for(int i=0;i<4;i++)
			System.out.println(aa[i]);

	}

}
