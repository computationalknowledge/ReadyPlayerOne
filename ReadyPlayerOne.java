public class GameRunner {
	public static String WinningSpy;
	public static void main(String[] args) {
		Fight fight = new Fight();
		fight.doBattle();
		System.out.println("Winner is " + WinningSpy);
	}
}

class Fight {
	boolean BattleIsOver = false;
	Hero Johnny = new Hero();
	Villian BorisAndNatasha = new Villian();

	public void doBattle() {
		while (! BattleIsOver) {
			BorisAndNatasha.Health = BorisAndNatasha.Health - Johnny.attack();
			if (BorisAndNatasha.Health < 0) {
				GameRunner.WinningSpy = "Johnny Bravo";
				BattleIsOver = true;
			}
			
			Johnny.Health = Johnny.Health - BorisAndNatasha.attack();
			if (Johnny.Health < 0) {
				GameRunner.WinningSpy = "Boris and Natasha";
				BattleIsOver = true;
			}
			
		}
	}
}

class Hero {
	public int Health = 100;

	static int attack() {
		java.util.Random rand = new java.util.Random();
		int AttackStrength = rand.nextInt(100);
		return AttackStrength;
	}
}

class Villian {
	public int Health = 100;

	int attack() {
		java.util.Random rand = new java.util.Random();
		int AttackStrength = rand.nextInt(100);
		return AttackStrength;
	}
}
