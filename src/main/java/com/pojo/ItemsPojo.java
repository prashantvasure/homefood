package com.pojo;
import com.model.Items;


public class ItemsPojo {
	
	private int id;
	private String itemname;
	private boolean active;
	private int count;
    private int price;
    
    
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Items getItemsConvetor(ItemsPojo itemsPojo) {
		Items items = new Items();
		items.setItemname(itemsPojo.getItemname());
		items.setPrice(itemsPojo.getPrice());
		items.setActive(itemsPojo.isActive());
		items.setCount(itemsPojo.getCount());
		return items;
		
}
	
	
}