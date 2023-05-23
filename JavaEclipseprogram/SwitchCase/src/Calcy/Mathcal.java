package Calcy;

public class Mathcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=40,res;
		char op='*';
		switch(op) {
		case '+':
			res=a+b;
			System.out.println("Addition="+res);
			break;
		case '-':
			res=b-a;
			System.out.println("Subtraction="+res);
			break;
		case '*':
			res=a*b;
			System.out.println("Multiplication="+res);
			break;
		case '/':
			res=b/a;
			System.out.println("Division="+res);
			break;
		case'%':
			res=b%a;
			System.out.println("Remanider="+res);
			break;
		default:
			System.out.println("wrong choice......");
			
		}//end of switch
		

	}//end of amin

}
