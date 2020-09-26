package com.dao;  
  
import java.util.List;

import com.model.Cart;
import com.pojo.CartPojo;  
  
public interface CartDao {  
  
    public boolean saveCart(CartPojo cartPojo);  
   // public Cart getCartByUserId(int userid);  
    public boolean deleteItemCart(int userid, int itemid);  
    public List<Cart> getCartByUserId(int userid);  
}  