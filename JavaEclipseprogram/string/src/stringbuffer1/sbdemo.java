package stringbuffer1;

public class sbdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer("Core   Java");
		StringBuffer sb3=new StringBuffer("core   java for basic programming");
		StringBuffer sb4=sb3;
		StringBuffer sb2=new StringBuffer(500);
		System.out.println("Initial capacity of string buffer="+sb.capacity());
		System.out.println("Initial capacity of string buffer using sb1 object="+sb1.capacity());
		System.out.println("Initial capacity of string buffer using sb2="+sb2.capacity());
sb1.append(" For programming...");
System.out.println("Using append method="+sb1);
System.out.println("Using  length="+sb1.length());
System.out.println("Using equals method="+sb1.equals(sb3));
System.out.println("Using equals method after assiging objects...="+sb3.equals(sb4));
System.out.println("Using index of method="+sb3.indexOf("a"));
System.out.println("Using last  index of method="+sb3.lastIndexOf("a"));
System.out.println("Using replace method="+sb3.replace(1, 5, "java"));
System.out.println("Using subsequence method="+sb3.subSequence(0, 20));
/*StringBuffer sb5=sb3.setCharAt(0, "c");
System.out.println("Using set char at method=");*/


	}

}
