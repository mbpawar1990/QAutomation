package interface1;
interface Math{

  public	static void cube(int x) {
		int a=x*x*x;
		System.out.println("cube="+a);
	}
}

public class StaticMethod implements Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticMethod m=new StaticMethod();
 //System.out.println("cube value="+(m.cube(3)));
		Math.cube(3);
	}

}
