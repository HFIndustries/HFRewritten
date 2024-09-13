package herpfortress.unit;

import herpfortress.Player;
import herpfortress.weapon.RocketLauncher;

public class Soldier extends Mob {
	public Soldier(Player player) {
		super(1, player);
		maxHealth = health = 200;
		speed = 80;

		weapon = new RocketLauncher(this);
	}
}