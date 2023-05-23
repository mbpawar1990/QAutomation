package propertisofobjectclassmethod;

public class Hashcodemethod {
	int rollno;
	 Hashcodemethod(){
		 rollno=100;
		 
	 }
	 public int hashcode(){
		 //System.out.println("using hashcode override method");
		 return rollno;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer("123");
		int val=i.hashCode();
		System.out.println("hashcode value="+val);
		 Hashcodemethod h=new  Hashcodemethod();
		 System.out.println("using hashcode value object="+h.hashcode());

	}

}
