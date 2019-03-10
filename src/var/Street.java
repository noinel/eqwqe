package var;

public class Street {

	public static void main(String[] args) {
	/*
		int num = 3;
		while(num < 101) {
			System.out.println(num);
			num = num + 3;
			
		}*/ //컨트롤+시프트+? 선택영역 주석처리
		int destination = 11271; //미터
		int speed = 3; //초당 3미터
		
		//당신의 자동차가 얼마만에 목적지에 도착하는지
		int sec = destination/speed;
		int min = sec/60;
		sec = sec%60;
		System.out.println(sec+"초");
		int hour = min /60;
		min = min%60;
		System.out.println(min+"분");
		System.out.println(hour+"시간");
		System.out.println(hour+"시간 "+min+"분 "+sec+"초 ");
	}

}
