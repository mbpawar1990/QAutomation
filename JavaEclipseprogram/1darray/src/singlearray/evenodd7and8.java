package singlearray;

public class evenodd7and8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,52,69,78,41,56,2,3,26,36,45};
		//even
		System.out.println("Even position elements are..");
		for(int i=0;i<a.length;i=i+2) {
			
			System.out.println("Index="+i+" "+"value="+a[i]);
		}
		System.out.println(); 
		System.out.println("odd position elemntsr are...");
		for(int j=1;j<a.length;j=j+2) {
			System.out.println("index="+j+" "+"value="+a[j]);
		}

	}

}
