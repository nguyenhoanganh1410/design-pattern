package iuh.fit.se.state_parttern.news;

public class RejectState implements State{

	@Override
	public void handleRequest(Contex contex) {
		// TODO Auto-generated method stub
		System.out.println("reject state");
		contex.setState(this);
	}	

	
	public String toString() {
		return "it is reject state";
	}
	
}
