package Factory;

public class LawnMower {

	String name;
	int price;
	String type;
	private static LawnMower uniqueInstance;
		//Implementing the Singleton pattern 
	
	public static LawnMower getInstance() {
		if(uniqueInstance==null) {
			System.out.println("Singleton Pattern will ensure that only one object is created");
			uniqueInstance= new LawnMower();
		}
		return uniqueInstance;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	public void Order() {
		System.out.println("You have Ordered "+ name);
	}
	public void Pack() {
		System.out.println("Started packing your Order "+name);
	}
	
	
	public String toString() {
		StringBuffer display=new StringBuffer();
		display.append(name+"\n");
		display.append(price +"\n");
		display.append(type +"\n");
		return display.toString();
		
	}
}
