package Factory;

public class LawnMowerStore {

	LawnMowerFactory factory;
	
	public LawnMowerStore(LawnMowerFactory factory) {
		this.factory=factory;
	}
	
	public LawnMower Order(String type) {
		
		LawnMower l;
		
		l=factory.Order(type);
		l.Order();
		l.Pack();
		return l;
		
	}

}
