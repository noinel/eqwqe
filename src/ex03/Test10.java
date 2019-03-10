package ex03;

public class Test10 {

	public static void main(String[] args) {
		int num = 0;
		/*for(int i=4; i <=300; i= i+4) {
			num= num+i;
		}*/
		for(int j = 1; j<301;j++) {
			if(j%4 ==0) {
			num=num+j;}
			
		}
		System.out.println("1~300사이의 4의배수의 합 : "+num);
	}

}
