package herpfortress.unit;

import herpfortress.Player;
import herpfortress.weapon.Minigun;

public class Heavy extends Mob {
	public Heavy(Player player) {
		super(4, player);
		maxHealth = health = 300;
		speed = 77;

		weapon = new Minigun(this);
	}
}