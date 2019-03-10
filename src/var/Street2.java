package var;

import java.util.Scanner;

public class Street2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("총거리를 입력하세요");
		int destination = in.nextInt();//거리
		System.out.println("초당 스피드를 입력하세요");
		int speed = in.nextInt();//속도
		
		// 몇시간 몇분 몇초
		int sec = destination/speed;
		//System.out.println(sec+"초");
		int min = sec/60;
		//System.out.println(min+"분");
		int r_sec = sec%60;//남은초
		int hour = min/60;
		//System.out.println(hour+"시간");
		int r_min =min%60;
		System.out.println(hour+"시간 "+r_min+"분 "+r_sec+"초");
	}
}
