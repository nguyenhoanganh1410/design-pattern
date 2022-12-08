package iuh.fit.se.decorator;

import java.util.Date;

public class TeamLeader extends EmployeeDecorator{

	public TeamLeader(EmployeeComponent employeeComponent) {
		super(employeeComponent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		System.out.println("leader do task...");
	}

	@Override
	public void joind(Date joinedDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminate(Date terminateDate) {
		// TODO Auto-generated method stub
		
	}

	public void planning() {
		System.out.println("planning....");
	}
	public void monitor() {
		System.out.println("monitoring....");
	}
}
