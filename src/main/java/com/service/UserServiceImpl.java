package com.service;


import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
import com.dao.*;

import com.model.Users;
@Service  
@Transactional  
public class UserServiceImpl {  
  
   @Autowired  
   private UsersDao usersdao;  
     
   
   public boolean saveUsers(Users users) {  
       return usersdao.saveUsers(users);  
   }  
 
   
   public Users getUsers(int id) {  
       return usersdao.getUsersByID(id);  
   }  
 
   
   public boolean deleteUsers(Users users) {  
       return usersdao.deleteUsers(users);  
   }  
 
   
   public List<Users> getUsersByID(Users users) {  
       return usersdao.getUsersByID(users);  
   }  
 
   
   public boolean updateUsers(Users users) {  
       return usersdao.updateUsers(users);  
   }  
 
}  