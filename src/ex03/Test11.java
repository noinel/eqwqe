package ex03;

public class Test11 {

	public static void main(String[] args) {
		int a[] = {32, 11, 12, 18,36};
		
		for(int i=0; i<5;i++) {
			int n1 = a[i]%3;
			int n2 = a[i]%4;
			int sum = n1+ n2;
					System.out.println(i+"번째 loop");
					System.out.println("sum :"+sum);
					
					if(sum==0) {
						System.out.println(a[i]+"는 3과4의 공배수");
					}else {

						System.out.println(a[i]+"는 공배수가 아닙니다.");
					}
		}
	}

}
