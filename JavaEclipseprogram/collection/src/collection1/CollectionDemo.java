package collection1;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(100);
al.add("Java");
al.add(200);
al.add('c');
System.out.println(al);
ArrayList al2=new ArrayList();
System.out.println(" second array list.....");
System.out.println(al2);
al2.addAll(al);
System.out.println(al2);
System.out.println(al2.add(500));
System.out.println(al2.contains(400));
System.out.println(al2.isEmpty());
System.out.println(al2.size());
al.remove("Java");
System.out.println(al);
al.removeAll(al2);
System.out.println(al);
System.out.println(al2);
al2.clear();
System.out.println(al2);

	}

}
