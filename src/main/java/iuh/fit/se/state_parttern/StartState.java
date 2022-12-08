package iuh.fit.se.state_parttern;

public class StartState implements State{

	public void doSomething(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Start state....");
		context.setState(this);	
	}
	
	public String toString() {
		return "start";
	}

}
