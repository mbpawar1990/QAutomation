package string1;

public class Stringnew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("Core java programming   ");
System.out.println("String length="+s.length());
System.out.println("Concat Stirng= "+s.concat("Program"));
String s1="Java";
String s2="java";
String s3="Java";
System.out.println("Comapring strings s1 and s3="+s1.equals(s3));
System.out.println("Compring strings s1 and s2="+s1.equals(s2));
System.out.println("Using ignore case s2 and s3= "+s2.equalsIgnoreCase(s3));
System.out.println("using == operator="+(s1==s2));
System.out.println("using uppercase methods="+s2.toUpperCase());
System.out.println("Using lower case methods="+s3.toLowerCase());
System.out.println("Using trim methods="+s.trim());
System.out.println("Check with starts with specific letter="+s.startsWith("c"));
System.out.println("Chek with ends letter="+s.endsWith(" "));
System.out.println("Checking with specific index character="+s.charAt(3));
int a=10;
System.out.println(" value of method="+s2.valueOf(a));
String s11=s.replace("java","Python");
System.out.println("Replace method="+s11);
String s22=s.intern();
System.out.println(s22);


	}

}
