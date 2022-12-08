package iuh.fit.se;

public class Main {
	public static void main(String[] args) {
		Home home = new HomeBuilder().buildColor("red").buildSofa("sofa white").build();
		
		System.out.println(home);
	}
}
