package herpfortress.unit;

import herpfortress.Player;
import herpfortress.weapon.Scattergun;

public class Scout extends Mob {
	public Scout(Player player) {
		super(0, player);
		maxHealth = health = 125;
		speed = 133;
		visRange = 10;

		weapon = new Scattergun(this);
	}
}