package com.daoimpl;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import com.dao.UsersDao;
import com.model.Users;
import com.repository.UsersRepository;  
  
@Repository  
public class UsersDaoImpl  implements UsersDao{  
  
	@Autowired
	UsersRepository usersRepository;

   
      
    @Override  
    public boolean saveUsers(Users users) {  
        boolean status=false;  
        try {  
        	usersRepository.save(users);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
  
    @Override  
    public Users getUsersByID(int id) {  
    	System.out.println("iddddddddddd"+id);
    //    Session currentSession = sessionFactory.getCurrentSession();  
    //    Query<Student> query=studentRepository.createQuery("from Student", Student.class);  
    	return usersRepository.findByNameEndsWith(id);
    }  
  
    @Override  
    public boolean deleteUsers(Users user) {  
        boolean status=false;  
        try {  
        	usersRepository.delete(user);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }

	@Override
	public List<Users> getUsersByID(Users User) {
		
		return null;
	}

	@Override
	public boolean updateUsers(Users user) {
		
		return false;
	}  
  
   /* @Override  
    public List<Student> getStudentByID(Student student) {  
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<Student> query=currentSession.createQuery("from Student where student_id=:student_id", Student.class);  
        query.setParameter("student_id", student.getId());  
        List<Student> list=query.getResultList();  
        return list;  
    }  
  
    @Override  
    public boolean updateStudent(Student student) {  
        boolean status=false;  
        try {  
        	studentRepository.update(student);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
      
      */
  
}