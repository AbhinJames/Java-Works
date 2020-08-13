package model;

public class Item 
{
	
	int itemId;
	String itemName;
	public int getItemId() {
		return this.itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Item(int itemId, String itemName) {
		
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	
	
	
	

}
