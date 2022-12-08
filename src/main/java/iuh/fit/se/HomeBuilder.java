package iuh.fit.se;

public class HomeBuilder implements Builder{
	
	public String wall;
	public String color;
	public String door;
	public String sofa;

	public Builder buildWall(String wall) {
		// TODO Auto-generated method stub
		this.wall = wall;
		return this;
	}

	public Builder buildColor(String color) {
		this.color = color;
		return this;
	}

	public Builder buildSofa(String sofa) {
		this.sofa = sofa;
		return this;
	}

	public Home build() {
		
		return new Home(wall, color, door, sofa);
	}

}
