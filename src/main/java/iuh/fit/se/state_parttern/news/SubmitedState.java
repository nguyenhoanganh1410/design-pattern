package iuh.fit.se.state_parttern.news;

public class SubmitedState implements State {

	@Override
	public void handleRequest(Contex contex) {
		// TODO Auto-generated method stub
		System.out.println("submited state");
		contex.setState(this);
	}	

	
	public String toString() {
		return "it is submited state";
	}
}