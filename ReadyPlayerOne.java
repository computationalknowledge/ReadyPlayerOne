import java.util.Random.*;

public class GameRunner {
	
	public static String WinningSpy;
	
	public static void main(String[] args) {
		Fight fight = new Fight();
		System.out.println("Winner is " + WinningSpy);
	}
}

class  Fight {
	static boolean BattleIsNotOver = true;
	Hero Johnny = new Hero();
	Villian BorisAndNatasha = new Villian();

	public static void doBattle() {
		while (BattleIsNotOver) {
			if ( Johnny.Health - Johnny.attack() < 0) {
				GameRunner.WinningSpy = "Boris and Natasha";
				BattleIsNotOver = false;
			}
			BorisAndNatasha.attack();
			if ( BorisAndNatasha.Health - BorisAndNatasha.attack() < 0) {			
				GameRunner.WinningSpy = "Johnny Bravo";
				BattleIsNotOver = false;			
		}
	}
}

class Hero {
	public static int Health = 100;
	
	static int attack() {
		java.util.Random rand = new java.util.Random();
		int AttackStrength = rand.nextInt(100);
		return AttackStrength;
	}
}

class Villian {
	public static String villianName;
	public static int Health;

	static int attack() {
		java.util.Random rand = new java.util.Random();
		int AttackStrength = rand.nextInt(100);
		return AttackStrength;
	}
}
