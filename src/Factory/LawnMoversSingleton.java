package Factory;

public class LawnMoversSingleton {
	public static void main(String [] args) {
		
		LawnMower l=LawnMower.getInstance();
		LawnMowerFactory factory= new LawnMowerFactory();
	
		LawnMowerStore store= new LawnMowerStore(factory);
		LawnMower l1=store.Order("Zero-Turn Mowers");
	
	System.out.println(l1);
	// This will call the same instance without creating another object
	LawnMower l2= LawnMower.getInstance();
	LawnMower l3= store.Order("Lawn Tractor");
	System.out.println(l3);
	

}
}