package baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame2 {
	
	
	static int checkData(int data) {
		for (int i = 1; i < 6; i++) {
			if (i == data) {
				return data;
			}
		}
		Random r = new Random();

		data = r.nextInt(5) + 1;
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team lotte = new Team();
		Team nc = new Team();
		lotte.newTeam();
		nc.newTeam();
		
		Point home= new Score2();	
		Point away= new Score2();
		
		Point team = away;
		Team setTeam[] = lotte.getPl();
		
		System.out.println("친구와 야구 게임을 합니다.");
		System.out.println("LOTTE의 공격으로 시작합니다.");
		Scanner sc = new Scanner(System.in);
		while(team.getRound() != 10) {
			
		while (team.getChange() == false ) {
			//team.playerSet("한국");
			
			team.playerSet(setTeam[team.getPlayerNum()].getName());
			System.out.println(team.getPlayerName()+"선수");
			System.out.println("숫자를 입력해 주십시오(1~5)");

			int input = sc.nextInt();

			// 게임시작
			Random r = new Random();

			int com = r.nextInt(5) + 1;
			input = checkData(input);
			int user = input;

			// 타자가 교체 될때까지
			System.out.println("USER: " + user);
			System.out.println("COM: " + com);
			if (com == 4) {
				// System.out.println("볼");
				team.setBallCount();// 볼카운트 증가
			} else if (com == user) {
				if (user == 5) {
					// System.out.println("홈런");
					team.homeRun();// 진루한 타자수만큼 점수
				} else {
					System.out.println("안타");
					team.hit();// 타자 1루전진
				}
			} else // if(com != user)
			{
				// System.out.println("스트라이크");
				team.setStrikeCount();// 스트라이크 카운트증가
			}
			if(team==away) {
			System.out.println("LOTTE의 공격");
			}else {
			System.out.println("NC의 공격");
			}
			team.running();
			
			System.out.println("LOTTE "+away.getScore()+":"+"NC "+home.getScore());
			
			System.out.println();
			System.out.println("===============================");
		}
		team.setChange();
		System.out.println("===============================");
		System.out.println();
		System.out.println("===============================");
		System.out.println("공수 교대");
		System.out.println("===============================");
		System.out.println();
		System.out.println("===============================");
		if(team==away) {
			team= home;
			setTeam = nc.getPl();
			System.out.println(team.getRound()+"회 말");
		}
		else {
			team = away;
			setTeam = lotte.getPl();
			team.setRound();
			System.out.println(team.getRound()+"회 초");
		}
		
		
		}
		
		System.out.println("동전을 더 넣어 주십시오");
		sc.close();
	}

}
