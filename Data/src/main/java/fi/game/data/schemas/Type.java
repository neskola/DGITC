package fi.game.data.schemas;

public enum Type {
	WALL(1),
	FLOOR(2),
	CEILING(3),
	LIGHT(4),
	DOOR(5);
	
	private final int type;
	private Type(int type) {
		this.type = type;
	}
	
	public int getType() {
		return this.type;
	}
} 
