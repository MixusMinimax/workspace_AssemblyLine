package classes;

public class Tile {
	
	private boolean hover, press, selected;
	private String type = "empty";
	
	public Tile() {
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void select() {
		selected = true;
	}
	
	public void deselect() {
		selected = false;
	}
	
	public boolean isSelected() {
		return selected;
	}
}