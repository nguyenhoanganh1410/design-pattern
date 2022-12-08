package iuh.fit.se.state_parttern.news;

public class Contex {
	private State state;

	public Contex() {
		super();
		this.state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
