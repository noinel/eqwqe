package	base;

public class Score {
	private int score;
	private int ball;
	private int strike;
	private int out;
	private String[] runnerarray = { "000", "100", "110", "111" };
	private int hit;
	private int homerun;
	private int count;

	public int getHomerun() {
		return homerun;
	}

	public void setHomerun() {
		strike = 0;
		ball = 0;
		score++;
		score += count;
		count = 0;
		hit = 0;
		System.out.println();
		System.out.println("홈런입니다.");
	}

	public int getHit() {
		return hit;
	}

	public void setHit() {
		strike = 0;
		ball = 0;
		hit++;
		count++;
		if (count >= 3) {
			count = 3;
		}
		if (hit > 3) {
			score++;
		}
		System.out.println();
		System.out.println("안타 입니다.");
	}

	public int getOut() {
		return out;
	}

	public void setOut() {
		if (strike == 2) {
			ball = 0;
			strike = -1;
		} else if (ball == 3) {
			ball = -1;
			strike = 0;
		}
	}

	public int getStrike() {
		return strike;
	}

	public void setStrike() {
		if (strike >= 2) {
			System.out.println("아웃!!");
			setOut();
			out++;
		}
		System.out.println();
		System.out.println("스트라이크 입니다.");
		strike++;

	}

	public int getBall() {
		return ball;
	}

	public void setBall() {
		if (ball == 3) {
			System.out.println();
			System.out.println("진출");
			setOut();
			count++;
		}
		System.out.println();
		System.out.println("볼 입니다.");
		ball++;
	}

	public String getRunnerarray() {
		return runnerarray[count];
	}

	public void setRunnerarray() {

	}

	public int getScore() {
		return score;
	}

	public void setScore() {
	}
}
