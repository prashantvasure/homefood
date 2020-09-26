package com.daoimpl;

import java.util.List;  


import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import com.dao.ItemsDao;
import com.model.Items;
import com.pojo.ItemsPojo;
import com.repository.ItemsRepository;
import com.repository.UsersRepository;
  
@Repository  
public class ItemsDaoImpl  implements ItemsDao{  
  
	@Autowired
	ItemsRepository itemsRepository;

	@Autowired
	UsersRepository usersRepository;
      
    @Override  
    public boolean saveItems(ItemsPojo itemsPojo) {  
     
    	Items items = itemsPojo.getItemsConvetor(itemsPojo);
        itemsRepository.save(items);
		return true;  
    }  
  
    @Override  
    public Items getItemsByID(int id) {  
    	System.out.println("iddddddddddd"+id);
    //    Session currentSession = sessionFactory.getCurrentSession();  
    //    Query<Student> query=studentRepository.createQuery("from Student", Student.class);  
    	return itemsRepository.findByNameEndsWith(id);
    }  
  
    @Override  
    public boolean deleteItems(Items item) {  
        boolean status=false;  
        try {  
        	itemsRepository.delete(item);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }

	@Override
	public List<String> getAllActiveItems() {
		
		return itemsRepository.activeItems();
	}

	@Override
	public boolean updateItems(Items item) {
		
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