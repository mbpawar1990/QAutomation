package singlearray;

public class FreqNew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {1,1,2,2,3,6,5,4,8,9,7,2};
		int fre[]=new int[b.length];
		int visit=1;
		
		for(int i=0;i<b.length;i++) {
			int cnt=1;
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					cnt++;
					fre[j]=visit;
				}
			}
				if(fre[i]!=visit) {
					fre[i]=cnt;
				}
			
		}
		for(int i=0;i<fre.length;i++) {
			if(fre[i]!=visit) {
				System.out.println(b[i]+" frequency="+fre[i]);
			}
		}

	}

}
