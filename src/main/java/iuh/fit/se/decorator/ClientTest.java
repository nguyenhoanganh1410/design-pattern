package iuh.fit.se.decorator;

public class ClientTest {
	public static void main(String[] args) {
		EmployeeConcreteComponent emp = new EmployeeConcreteComponent();
		
		emp.doTask();
		
		TeamLeader teamLeader = new TeamLeader(emp);
		teamLeader.planning();
		teamLeader.doTask();
		teamLeader.monitor();
	}
}
