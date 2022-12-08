package iuh.fit.se.singleton;

public class ClientTest {
	public static void main(String[] args) {
		EagerInit eager = EagerInit.getInstance();
		
		eager.setName("anh");
		System.out.println(eager.getName());
		
		EagerInit eager2 = EagerInit.getInstance();
		System.out.println(eager2.getName());
	}

}
