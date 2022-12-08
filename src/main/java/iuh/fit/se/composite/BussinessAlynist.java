package iuh.fit.se.composite;

public class BussinessAlynist extends Employee{

	public BussinessAlynist(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("=======Buss======");
				System.out.println("name : " + this.name);
				System.out.println("Age : " + this.age);
	}

}
