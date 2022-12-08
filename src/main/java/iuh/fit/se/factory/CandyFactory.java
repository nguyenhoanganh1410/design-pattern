package iuh.fit.se.factory;

public class CandyFactory {
	public static Candy getCandyType(String type) {
		if(type.equals("HardCandy")) {
			return new HardCandy();
		}
		else if(type.equals("SweetCandy")) {
			return new SweetCandy();
		}
		
		return null;
	}
}
