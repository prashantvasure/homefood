package com.dao;  
  
import com.model.Contact;
import com.pojo.ContactPojo;  
  
public interface ContactDao {  
  
    public boolean saveContact(ContactPojo contactPojo);  
    public Contact getContactByuserId(int userId);  
    public boolean deleteContact(int userId);  
    public boolean updateContact(int userId);  
}  