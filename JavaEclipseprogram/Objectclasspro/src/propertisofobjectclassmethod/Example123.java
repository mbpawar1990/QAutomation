package propertisofobjectclassmethod;

class print1 {
	int a=12;

	public int hashcode(){
		return 101;
	}
	@Override
	public String toString() {
		return "override toString9) method";
	}
}

public class Example123  {
	static int rno=100;
	int no;
	 Example123(){
		 no=rno;
		 rno++;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Example123 s1=new  Example123();
		 System.out.println(s1);
		 System.out.println(s1.hashCode());
		 Example123 s2=new  Example123();
		 System.out.println("Equlas method="+s1.equals(s2));
		 Example123 s3=s2;
		 System.out.println("Equals method="+s3.equals(s2));
		 */
		 print1 p1=new print1();
		 System.out.println(p1.toString());
		 System.out.println(p1.hashcode());
		 
		 print1 p2=new print1();
		 System.out.println(p2.equals(p1));
		 System.out.println(p2.hashcode());
		 System.out.println(p2.equals(p2));
		 
		 

	}

}
