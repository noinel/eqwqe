package ex03;

public class Test04 {

	public static void main(String[] args) {
		//구구단3단
		//9번 돌아야함
		//3*1 = 3
		//3*2 = 6
		//3*3 = 9
		//3*4 = 12
		//3*5 = 15
		//3*6 = 18
		//3*7 = 21
		//3*8 = 24
		//3*9 = 27
	
		/*	for(int num= 2; num<10; num++) {
			for(int i = 1; i<10; i++) {
				
				System.out.print(num+"*"+i+"="+(num*i+" "));
			}	
			System.out.println();
		}
		*/
		
		for(int i = 2; i <10; i++) {
			System.out.println(i+"단");
			for(int k = 1; k<10; k++) {
				System.out.print(i+"*"+k+"="+(i*k)+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
