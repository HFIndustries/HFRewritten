package herpfortress.unit;

import herpfortress.Player;
import herpfortress.weapon.Shotgun;

public class Engineer extends Mob {
	public Engineer(Player player) {
		super(5, player);
		maxHealth = health = 125;
		speed = 100;

		weapon = new Shotgun(this);
	}
}