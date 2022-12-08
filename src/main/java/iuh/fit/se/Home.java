package iuh.fit.se;

public class Home {
	public String wall;
	public String color;
	public String door;
	public String sofa;
	
	
	@Override
	public String toString() {
		return "Home [wall=" + wall + ", color=" + color + ", door=" + door + ", sofa=" + sofa + "]";
	}
	public Home(String wall, String color, String door, String sofa) {
		super();
		this.wall = wall;
		this.color = color;
		this.door = door;
		this.sofa = sofa;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getSofa() {
		return sofa;
	}
	public void setSofa(String sofa) {
		this.sofa = sofa;
	}
	
	
	

}
