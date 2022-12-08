package iuh.fit.se.decorator;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent{

	@Override
	public void doTask() {
		// TODO Auto-generated method stub
		System.out.println("build cart ui");
	}

	@Override
	public void joind(Date joinedDate) {
		// TODO Auto-generated method stub
		System.out.println(joinedDate);
	}

	@Override
	public void terminate(Date terminateDate) {
		// TODO Auto-generated method stub
		System.out.println(terminateDate);
		
	}

}
