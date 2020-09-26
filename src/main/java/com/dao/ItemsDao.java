package com.dao;  
  
import java.util.List;

import com.model.Items;
import com.pojo.ItemsPojo;  
  
public interface ItemsDao {  
  
    public boolean saveItems(ItemsPojo itemsPojo);  
    public Items getItemsByID(int id);  
    public boolean deleteItems(Items items);  
    public List<String> getAllActiveItems();  
    public boolean updateItems(Items Items);  
}  