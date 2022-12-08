package iuh.fit.se.decorator;

public abstract class EmployeeDecorator implements EmployeeComponent {
	protected EmployeeComponent employeeComponent;

	public EmployeeDecorator(EmployeeComponent employeeComponent) {
		super();
		this.employeeComponent = employeeComponent;
	}

	public EmployeeComponent getEmployeeComponent() {
		return employeeComponent;
	}

	public void setEmployeeComponent(EmployeeComponent employeeComponent) {
		this.employeeComponent = employeeComponent;
	}
	
	

}
