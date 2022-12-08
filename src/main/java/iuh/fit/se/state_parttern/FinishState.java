package iuh.fit.se.state_parttern;

public class FinishState implements State{

	@Override
	public void doSomething(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Finish state...");
		context.setState(this);	
	}

	public String toString() {
		return "finish";
	}
}
