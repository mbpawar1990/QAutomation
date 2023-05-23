package singlearray;

public class duplicateEle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[]= {10,20,9,6,10,10,2,6,45};
int cnt=0;
System.out.println("Array Elements are...");
for(int i=0;i<b.length;i++) {
	System.out.print(b[i]+" ");
}
for(int i=0;i<b.length;i++) {
	for(int j=1;j<b.length;j++) {
		if(b[j]==b[i]) {
			cnt=cnt+1;
			
			
		}
	}
	
}
System.out.println();
if(cnt==0) {
	System.out.println("Dupliacte elements not found...");
}else {
	System.out.println("Duplicate elements found...");
}
	}

}
