package com.rest;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.service.ItemsServiceImpl;
import com.model.Items;
import com.pojo.ItemsPojo;  
  
@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class ItemsController {  
      
    @Autowired  
    private ItemsServiceImpl itemsrservice;  
      
    // http://localhost:8888/api/save-items
    @PostMapping("save-items")  
    public boolean saveItems(@RequestBody ItemsPojo itemsPojo) {  
         return itemsrservice.saveItems(itemsPojo);  
          
    }  
      
    @GetMapping("items-list/{itemId}")  
    public Items items(@PathVariable("itemId") int itemId) {  
         return itemsrservice.getItems(itemId);  
          
    }  
    
    // http://localhost:8888/api/delete-items/3
    @DeleteMapping("delete-items/{itemId}")  
    public boolean deleteItems(@PathVariable("itemId") int itemId, Items items) {  
    	items.setId(itemId);  
        return itemsrservice.deleteItems(items);  
    }  
  
    @GetMapping("itemslist")  
    public List<String> getAllActiveItems() {  
       
         return itemsrservice.getAllActiveItems();  
          
    }  
      
    @PostMapping("update-items/{Users_id}")  
    public boolean updateItems(@RequestBody Items items) {  
        return itemsrservice.updateItems(items);  
    }  
}  