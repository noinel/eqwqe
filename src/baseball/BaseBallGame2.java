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
		
		System.out.println("ģ���� �߱� ������ �մϴ�.");
		System.out.println("LOTTE�� �������� �����մϴ�.");
		Scanner sc = new Scanner(System.in);
		while(team.getRound() != 10) {
			
		while (team.getChange() == false ) {
			//team.playerSet("�ѱ�");
			
			team.playerSet(setTeam[team.getPlayerNum()].getName());
			System.out.println(team.getPlayerName()+"����");
			System.out.println("���ڸ� �Է��� �ֽʽÿ�(1~5)");

			int input = sc.nextInt();

			// ���ӽ���
			Random r = new Random();

			int com = r.nextInt(5) + 1;
			input = checkData(input);
			int user = input;

			// Ÿ�ڰ� ��ü �ɶ�����
			System.out.println("USER: " + user);
			System.out.println("COM: " + com);
			if (com == 4) {
				// System.out.println("��");
				team.setBallCount();// ��ī��Ʈ ����
			} else if (com == user) {
				if (user == 5) {
					// System.out.println("Ȩ��");
					team.homeRun();// ������ Ÿ�ڼ���ŭ ����
				} else {
					System.out.println("��Ÿ");
					team.hit();// Ÿ�� 1������
				}
			} else // if(com != user)
			{
				// System.out.println("��Ʈ����ũ");
				team.setStrikeCount();// ��Ʈ����ũ ī��Ʈ����
			}
			if(team==away) {
			System.out.println("LOTTE�� ����");
			}else {
			System.out.println("NC�� ����");
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
		System.out.println("���� ����");
		System.out.println("===============================");
		System.out.println();
		System.out.println("===============================");
		if(team==away) {
			team= home;
			setTeam = nc.getPl();
			System.out.println(team.getRound()+"ȸ ��");
		}
		else {
			team = away;
			setTeam = lotte.getPl();
			team.setRound();
			System.out.println(team.getRound()+"ȸ ��");
		}
		
		
		}
		
		System.out.println("������ �� �־� �ֽʽÿ�");
		sc.close();
	}

}
