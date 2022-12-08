package iuh.fit.se.state_parttern;

public class ClientTest {
	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doSomething(context);
		System.out.println(context.getState().toString());
		
		
		FinishState finishState = new FinishState();
		finishState.doSomething(context);
		System.out.println(context.getState().toString());
		System.out.println(context.getState().toString());
		
		
	}
}
