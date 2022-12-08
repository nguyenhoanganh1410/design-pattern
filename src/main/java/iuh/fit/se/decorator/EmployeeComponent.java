package iuh.fit.se.decorator;

import java.util.Date;

public interface EmployeeComponent {
	public void doTask();
	public void joind(Date joinedDate);
	public void terminate(Date terminateDate);
}
