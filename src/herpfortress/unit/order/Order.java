package herpfortress.unit.order;

import herpfortress.unit.Mob;

public class Order {
	public Mob unit;

	public void init(Mob unit) {
		this.unit = unit;
	}

	public void tick() {
	}

	public boolean finished() {
		return true;
	}
}