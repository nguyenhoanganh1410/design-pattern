package iuh.fit.se.state_parttern.news;

public class ClientTest {
	public static void main(String[] args) {
		Contex contex = new Contex();
		
		NewState newState =  new NewState();
		newState.handleRequest(contex);
		
		System.out.println("current state: " + contex.getState().toString());
		
		
		RejectState rejectState = new RejectState();
		rejectState.handleRequest(contex);
		System.out.println("current state: " + contex.getState().toString());
	}
}
