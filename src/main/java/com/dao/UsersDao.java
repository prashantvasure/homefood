package com.dao;  
  
import java.util.List;  
  
import com.model.Users;  
  
public interface UsersDao {  
  
    public boolean saveUsers(Users users);  
    public Users getUsersByID(int id);  
    public boolean deleteUsers(Users user);  
    public List<Users> getUsersByID(Users users);  
    public boolean updateUsers(Users Users);  
}  