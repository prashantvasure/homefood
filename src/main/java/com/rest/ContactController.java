package com.rest;


import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.service.ContactServiceImpl;
import com.model.Contact;
import com.pojo.ContactPojo;  
  
@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class ContactController {  
      
    @Autowired  
    private ContactServiceImpl contactservice;  
      
    // http://localhost:8888/api/save-contact
    @PostMapping("save-contact")  
    public boolean saveContact(@RequestBody ContactPojo contactPojo) { 
         return contactservice.saveContact(contactPojo);  
    }  
      
    @GetMapping("contact-list/{users_id}")  
    public Contact contact(@PathVariable("users_id") int id) {  
         return contactservice.getContact(id);
    }  
    
    // http://localhost:8888/api/delete-contact/3
    @DeleteMapping("delete-contact/{users_id}")  
    public boolean deletecontact(@PathVariable("users_id") int id) {  
       
        return contactservice.deleteContact(id);  
    }  
  
    @PostMapping("update-contact/{Users_id}")  
    public boolean updateContact(@PathVariable("Users_id") int users_id) {  
       
        return contactservice.updateContact(users_id);  
    }  
}  