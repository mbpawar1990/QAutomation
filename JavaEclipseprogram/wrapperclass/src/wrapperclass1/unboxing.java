package wrapperclass1;

public class unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double obj=23.5632;//unboxing
		System.out.println("Double balue="+obj);
		double sal=obj.doubleValue();//double datatype value cnovertd to Double wrapper c;lass
		System.out.println(obj==sal);
		Boolean b=true;//unboxing
		boolean b1=b.booleanValue();
		System.out.println(b==b1);
	}
}
