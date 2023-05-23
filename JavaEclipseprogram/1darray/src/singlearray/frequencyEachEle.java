package singlearray;

import java.util.Arrays;

public class frequencyEachEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {10,20,10,2,03,04,05,0,60,20};
		/*System.out.println("Sort array elements....");
		Arrays.sort(b);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}*/
		
for(int i=0;i<b.length;i++) {
	int cnt=1;
	if(i!=b.length-1) {
	for(int j=1;j<b.length;j++) {
		if(b[i]==b[j]) {
			cnt=cnt+1;
		}else {
			break;
		}
	}
	}
	System.out.println(b[i]+"->"+cnt);
	i+=cnt-1;
}
	}

}
