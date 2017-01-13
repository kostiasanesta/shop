package shop.com.volkov.task.items;

import shop.com.volkov.task.Item;

public class Carpet extends Item {
	private String wool = "Material: wool";
	private String sq = "Square: 4 m^2";

	public Carpet() {
		super.color = "Color is red";
		super.cost = 300;
		super.name = "Carpet";
	}

	public String getColor() {
		return super.color;
	}

	public int getCost() {
		return super.cost;

	}

	public String getName() {
		return super.name;
	}

	@Override
	public String getInfo() {
		String x = getName() + "\n" + wool + "\n" + sq + "\n" + getColor() + "\ncost: " + getCost();
		return x;
	}
}
