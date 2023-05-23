package stringprogramsall;

public class palinndromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
System.out.println("Reverse String="+rev);
if(name.equals(rev)) {
	System.out.println("String is palindrome....");
}
else {
	System.out.println("String is not palindrome...");
}
	
	}

}
