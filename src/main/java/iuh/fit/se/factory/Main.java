package iuh.fit.se.factory;

public class Main {
	public static void main(String[] args) {
		Candy candy = CandyFactory.getCandyType("HardCandy");
		
		candy.getCandy();
		
		Candy sweetCandy = CandyFactory.getCandyType("SweetCandy");
		sweetCandy.getCandy();
	}
}
