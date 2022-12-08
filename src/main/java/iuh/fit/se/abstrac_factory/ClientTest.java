package iuh.fit.se.abstrac_factory;

public class ClientTest {
	public static void main(String[] args) {
		EquiqmentAbstractFactory equiqmentAbstractFactory = EquitmentFactory.getFactory("wood");
		Table tableWood = equiqmentAbstractFactory.createTable();
		Chair chairWood = equiqmentAbstractFactory.createChair();
		
		System.out.println(tableWood.getTable());
		System.out.println(chairWood.getChair());
	}

}
