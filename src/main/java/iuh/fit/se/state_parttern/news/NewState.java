package iuh.fit.se.state_parttern.news;

public class NewState implements State{

	@Override
	public void handleRequest(Contex contex) {
		// TODO Auto-generated method stub
		System.out.println("news state");
		contex.setState(this);
	}	

	
	public String toString() {
		return "it is new state";
	}
}
