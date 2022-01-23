package Factory;

public class LawnMowerFactory {
	public LawnMower Order(String type) {
		LawnMower l=null;
		if(type.equals("Zero-Turn Mowers")) {
			l = new ZeroTurnMower();
		}else if(type.equals("Rear-Engine Riding Mowerh")) {
			l =new RideMover();
		}else if(type.equals("Lawn Tractor")) {
			l = new LawnTractor();
		}
		return l;
		
	}

}
