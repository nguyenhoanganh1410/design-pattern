package iuh.fit.se.composite;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Employee{
	private List<Employee> list = new ArrayList<Employee>();
	
	
	public Boss(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("=======BOSS======");
		System.out.println("name : " + this.name);
		System.out.println("Age : " + this.age);
		list.forEach(val ->{
			System.out.println(val.toString());
		});
	}

	@Override
	public void add(Employee e) {
		// TODO Auto-generated method stub
		list.add(e);
	}

}
