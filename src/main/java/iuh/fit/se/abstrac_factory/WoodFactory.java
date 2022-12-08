package iuh.fit.se.abstrac_factory;

public class WoodFactory extends EquiqmentAbstractFactory {

	@Override
	Table createTable() {
		// TODO Auto-generated method stub
		return new WoodTable();
	}

	@Override
	Chair createChair() {
		// TODO Auto-generated method stub
		return new WoodChair();
	}

}
