package iuh.fit.se.abstrac_factory;

public class EquitmentFactory {
	 public static EquiqmentAbstractFactory getFactory(String material){
	       if(material.equals("wood")) {
	    	   return new WoodFactory();
	       }
	       else if(material.equals("plastic")) {
	    	   return new PlasticFactory();
	       }
	       
	       return null;
	    }
}
