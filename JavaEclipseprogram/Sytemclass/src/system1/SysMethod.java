package system1;

import java.util.Properties;

public class SysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("System class properties.....");
		System.out.println(System.currentTimeMillis());
		String a="Shlesha"+System.lineSeparator()+"Jadhav";
		System.out.println(a);
		String b="Madhuri";
		b.equals("Jadhav");
		System.out.println("Hashcod eof b="+System.identityHashCode(b));
		Properties p=System.getProperties();
		System.out.println(p.getProperty("user.name"));
		System.out.println(p.getProperty("user.home"));
		System.out.println(p.getProperty("user.dir"));

	}

}
