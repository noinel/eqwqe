package calculate;

public class CalApp {
	static int plus(int x, int y) {//(매개 변수)
		int result = x + y;
		//System.out.println("더하기 : "+result);
		return result;// 리턴은 가장 마지막줄 
	}
	
	static int minus(int x, int y) {//(매개 변수)
		int result = x - y;
		//System.out.println("빼기 : "+result);
		return result;
	}
	
	static int divid(int x, int y) {//(매개 변수)
		int result = x / y;
		//System.out.println("나누기 : "+result);
		return result;
	}
	
	static int multiful(int x, int y) {//(매개 변수)
		int result = x * y;
		//System.out.println("곱하기 : "+result);
		return result;
	}
	
	//빼기, 나누기, 곱하기
	//minus, divid, multiful
	
		public static void main(String[] args) {
			int r1 = plus(6,2);
			System.out.println("plus : "+r1);

			int r2 = minus(6,2);
			System.out.println("minus : "+r2);

			int r3 = divid(6,2);
			System.out.println("divid : "+r3);

			int r4 = multiful(6,2);
			System.out.println("multiful : "+r4);
			

		}	

}
