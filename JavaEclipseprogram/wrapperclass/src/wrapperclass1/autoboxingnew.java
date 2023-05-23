package wrapperclass1;

public class autoboxingnew {

	public static void main(String[] args) {
		char s='A';
		Character obj=new Character(s);//autoboxing
		System.out.println("using == operator="+(s==obj));
		System.out.println(s);
		System.out.println(obj);
	}

}
