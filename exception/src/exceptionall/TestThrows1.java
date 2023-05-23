package exceptionall;
import java.io.*;

class M{
	void method()throws IOException{
		throw new IOException("Device erroe....");
	}
}
public class TestThrows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			M m=new M();
			m.method();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello...");
	}

}
