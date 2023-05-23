package exceptionall;
import java.util.*;
class YoungeAge extends Exception {
	YoungeAge(String str){
		super(str);
	}
}


public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		try
		{
			if(age<=18) {
				throw new YoungeAge("notright age to vote....");
			}else
			{
				System.out.println("votesucces..");
			}
		}
		catch(YoungeAge e) {
			e.printStackTrace();
		}
System.out.println("Hello");
	}

}
