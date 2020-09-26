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

import com.service.UserServiceImpl;

import com.model.Users;  
  
@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class UserController {  
      
    @Autowired  
    private UserServiceImpl userservice;  
      
    @PostMapping("/employees")
    boolean newEmployee(@RequestBody Users users) {
	    return  userservice.saveUsers(users);
	  }
	
    // http://localhost:8888/api/save-users
    @PostMapping("save-users")  
    public boolean saveUsers(@RequestBody Users users) {  
         return userservice.saveUsers(users);  
          
    }  
      
    @GetMapping("users-list/{users_id}")  
    public Users users(@PathVariable("users_id") int id) {  
         return userservice.getUsers(id);  
          
    }  
    
    // http://localhost:8888/api/delete-users/3
    @DeleteMapping("delete-users/{users_id}")  
    public boolean deleteUsers(@PathVariable("users_id") int id, Users users) {  
        users.setId(id);  
        return userservice.deleteUsers(users);  
    }  
  
    @GetMapping("Users/{Users_id}")  
    public List<Users> allUsersByID(@PathVariable("Users_id") int id,Users users) {  
         users.setId(id);  
         return userservice.getUsersByID(users);  
          
    }  
      
    @PostMapping("update-Users/{Users_id}")  
    public boolean updateUsers(@RequestBody Users Users,@PathVariable("Users_id") int Users_id) {  
        Users.setId(Users_id);  
        return userservice.updateUsers(Users);  
    }  
}  