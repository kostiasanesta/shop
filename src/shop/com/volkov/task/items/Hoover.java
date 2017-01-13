package shop.com.volkov.task.items;

import shop.com.volkov.task.Item;

public class Hoover extends Item {
	private String power = "power = 1600W";

	public Hoover() {
		super.color = "color is gray";
		super.cost = 500;
		super.name = "Hoover";

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
		String x= getName() + "\n" + power + "\n" + getColor() + "\ncost: " + getCost();
		return x;
	}

}
