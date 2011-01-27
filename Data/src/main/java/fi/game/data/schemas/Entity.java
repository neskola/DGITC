package fi.game.data.schemas;

public class Entity {
	
	private int entityId;
	private String name;
	private int textureId;
	private Type type;
	// everything starts from the origo
	private float xPos = 0.0f;
	private float yPos = 0.0f;
	private float zPos = 0.0f;
	// default size is 1.0 world units.
	private float xSize = 1.0f;
	private float ySize = 1.0f;
	private float zSize = 1.0f;
	
	public int getEntityId() {
		return entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTextureId() {
		return textureId;
	}
	public void setTextureId(int textureId) {
		this.textureId = textureId;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public float getxPos() {
		return xPos;
	}
	public void setxPos(float xPos) {
		this.xPos = xPos;
	}
	public float getyPos() {
		return yPos;
	}
	public void setyPos(float yPos) {
		this.yPos = yPos;
	}
	public float getzPos() {
		return zPos;
	}
	public void setzPos(float zPos) {
		this.zPos = zPos;
	}
	public float getxSize() {
		return xSize;
	}
	public void setxSize(float xSize) {
		this.xSize = xSize;
	}
	public float getySize() {
		return ySize;
	}
	public void setySize(float ySize) {
		this.ySize = ySize;
	}
	public float getzSize() {
		return zSize;
	}
	public void setzSize(float zSize) {
		this.zSize = zSize;
	}

	
}
