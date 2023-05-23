package forloop1;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13,cnt=0;
		for (int i=1;i<=a;i++) {
			 if(a%i==0) {
				 cnt++;
			 }//end of if
		}//end of for
		if(cnt==2) {
			System.out.println("Number is prime"+a);
		       }//end of if
		else
		      {
		
               System.out.println("Number is not prime"+a);
	         }
	}//end of main
	 
}//end of class
