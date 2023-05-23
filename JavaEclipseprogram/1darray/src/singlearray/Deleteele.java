package singlearray;

public class Deleteele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d[]= {23,56,41,85,20};
System.out.println("Array elemntes are...");
for (int i=0;i<d.length;i++) {
	System.out.println(d[i]);
}
int loc=3,val=85;
System.out.println("The value to be delete="+val);
System.out.println("location="+loc);
int size=d.length;

for(int i=loc;i<size-1;i++) {
	d[i]=d[i-1];
}
size--;
System.out.println("printing array elements after delete...");
for(int i=0;i<=size;i++)
{
	System.out.println(d[i]+" ");
}
	}

}
