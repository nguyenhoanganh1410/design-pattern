package iuh.fit.se;

public interface Builder {
	public Builder buildWall(String wall);
	public Builder buildColor(String color);
	public Builder buildSofa(String sofa);
	public Home build();
	
}
