package iuh.fit.se.composite;

public class ClientTest {
	public static void main(String[] args) {
		Boss b = new Boss("anh", 20);
		
		BussinessAlynist buss1 = new BussinessAlynist("minh", 20);
		BussinessAlynist buss2 = new BussinessAlynist("m", 22);
		
		b.add(buss2);
		b.add(buss1);
		
		b.print();
		
	}
}
