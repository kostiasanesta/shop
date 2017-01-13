package shop.com.volkov.task;

public abstract class Item implements ICostable, IPrintable {
	protected String color;
	protected int cost;
	protected String name;
	
	public int checkPrinter(){
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		return cost;
	}
}
