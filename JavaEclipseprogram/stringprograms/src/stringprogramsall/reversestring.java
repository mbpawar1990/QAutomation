package stringprogramsall;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Java";
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Revesre of "+name+"  is=  "+rev);

	}

}
