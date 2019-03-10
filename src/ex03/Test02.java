package ex03;

public class Test02 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<101;i++) {
			
			sum= sum+i;
		}
		System.out.println(sum);
		
		int dsum = 0;
		for(int i=2; i<102; i =i+2) {
			dsum= dsum+i;
		}

		System.out.println(dsum);
		
		int gsum = 0;
		
		for(int i=1; i<101; i++) {
			if(i % 2 == 0) {
				gsum= gsum+i;
			}
		}
		
		System.out.println(gsum);
		

		/*int ssum = 0;
		for(int i=1; i<101; i =i+2) {
			ssum= ssum+i;
		}

		System.out.println(ssum);
	*/
	
	}
	

}

