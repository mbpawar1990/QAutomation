package stringprogramsall;

public class Totaloccurrenceofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java programming java oops";
		int total=s.length();
		System.out.println("Total lenth="+total);
		int newtotal=s.replace("a", "").length();
		int cnt=total=newtotal;
		System.out.println("Char occurrence="+cnt);

	}

}
