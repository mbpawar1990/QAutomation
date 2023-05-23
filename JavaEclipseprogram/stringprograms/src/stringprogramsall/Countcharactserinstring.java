package stringprogramsall;

public class Countcharactserinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Learn Java";
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				
				cnt++;
			}
		}
		System.out.println("Total characters in string="+cnt);

	}

}
