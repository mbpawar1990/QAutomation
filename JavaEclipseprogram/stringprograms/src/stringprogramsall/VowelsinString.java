package stringprogramsall;

import java.util.Scanner;

public class VowelsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String=");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char [] name=str.toCharArray();
		int cnt=0;
		for(char c:name) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				cnt++;break;
			}
		}
System.out.println("vowels in string="+cnt);
	}

}
