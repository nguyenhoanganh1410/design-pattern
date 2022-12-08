package iuh.fit.se.abstrac_factory;

public  class PlasticFactory extends EquiqmentAbstractFactory{

	@Override
	Table createTable() {
		// TODO Auto-generated method stub
		return new PlasticTable();
	}

	@Override
	Chair createChair() {
		// TODO Auto-generated method stub
		return new PlasticChair();
	}
	
}
