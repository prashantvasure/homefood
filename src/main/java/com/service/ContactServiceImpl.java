package com.service;


import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
import com.dao.*;
import com.model.Contact;
import com.pojo.ContactPojo;
@Service  
@Transactional  
public class ContactServiceImpl {  
  
   @Autowired  
   private ContactDao contactdao;  
     
   
   public boolean saveContact(ContactPojo contactPojo) {  
       return contactdao.saveContact(contactPojo);  
   }  
   
   public Contact getContact(int userId) {  
       return contactdao.getContactByuserId(userId);  
   }  
 
   public boolean deleteContact(int userId) {  
       return contactdao.deleteContact(userId);  
   }  
   
   public boolean updateContact(int userId) {  
       return contactdao.updateContact(userId);  
   }  
 
}  