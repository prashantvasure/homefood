package com.service;


import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
import com.dao.*;
import com.model.Items;
import com.pojo.ItemsPojo;
@Service  
@Transactional  
public class ItemsServiceImpl {  
  
   @Autowired  
   private ItemsDao itemsdao;  
     
   
   public boolean saveItems(ItemsPojo itemsPojo) {  
       return itemsdao.saveItems(itemsPojo);  
   }  
 
   
   public Items getItems(int id) {  
       return itemsdao.getItemsByID(id);  
   }  
 
   
   public boolean deleteItems(Items items) {  
       return itemsdao.deleteItems(items);  
   }  
 
   
   public List<String> getAllActiveItems() {  
       return itemsdao.getAllActiveItems();  
   }  
 
   
   public boolean updateItems(Items items) {  
       return itemsdao.updateItems(items);  
   }  
 
}  