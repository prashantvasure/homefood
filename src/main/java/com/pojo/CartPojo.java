package com.pojo;
import com.model.Cart;

public class CartPojo {
	/**
	 * 
	 */
	private int id;
	private int count;
    private int itemid;
    private int userid;
	

	public Cart getCartConvetor(CartPojo cartPojo) {
		Cart cart = new Cart();
		cart.setCount(cartPojo.getCount());
		cart.setItemid(cartPojo.getItemid());
		cart.setUserid(cartPojo.getUserid());
		return cart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}