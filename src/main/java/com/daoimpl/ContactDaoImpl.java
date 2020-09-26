package com.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import com.dao.ContactDao;
import com.model.Contact;
import com.pojo.ContactPojo;
import com.repository.ContactRepository;
import com.repository.UsersRepository;  
  
@Repository  
public class ContactDaoImpl  implements ContactDao{  
  
	@Autowired
	UsersRepository usersRepository;

	@Autowired
	ContactRepository contactRepository;
      
    @Override  
    public boolean saveContact(ContactPojo contactPojo) {  

    	Contact contact = contactPojo.getContactConvetor(contactPojo);
    //    contact.setUser(usersRepository.findByNameEndsWith(contactPojo.getUserid()));
        contactRepository.save(contact);  
        return true;  
    }  
  
    @Override  
    public Contact getContactByuserId(int userId) {  
    //    Session currentSession = sessionFactory.getCurrentSession();  
    //    Query<Student> query=studentRepository.createQuery("from Student", Student.class);  
    	return contactRepository.findByNameEndsWith(userId);
    }  
  
    @Override  
    public boolean deleteContact(int userId) {  
        contactRepository.deleteById(userId);  
        return true;  
    }

	@Override
	public boolean updateContact(int userId) {
		
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