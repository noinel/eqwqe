package unit;

public interface StarcraftUnit {
	void attack(StarcraftUnit u);

	String repair();

	String getName();

	int getAtk();

	int getArm();

	int getSt();

	int getSh();

	int setSt(int dmst);

	int setSh(int dmsh);

}
