package iuh.fit.se.singleton;

public class EagerInit {
	 private static final EagerInit INSTANCE = new EagerInit();
	 private EagerInit(){}
	 
	 public static EagerInit getInstance(){
	        return INSTANCE;
	 }

	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
