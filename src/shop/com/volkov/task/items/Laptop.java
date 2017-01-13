package shop.com.volkov.task.items;

import shop.com.volkov.task.Item;

public class Laptop extends Item {
	private String proc = "CPU = Intel Core i7 3600Mhz";
	private String memory = "Memory = 8 gb DDR3";
	private String hardDisk = "Hard Disk = 1tb.";

	public Laptop() {
		super.color = "color is black";
		super.cost = 2000;
		super.name = "Laptop";

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

		String x = getName() + "\n" + proc + "\n" + memory + "\n" + hardDisk + "\n" + getColor() + "\ncost: "
				+ getCost();
		return x;
	}

}
