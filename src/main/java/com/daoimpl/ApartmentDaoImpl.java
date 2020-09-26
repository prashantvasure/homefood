package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import com.dao.ApartmentDao;
import com.model.Apartment;
import com.pojo.ApartmentPojo;
import com.repository.ApartmentRepository;  
  
@Repository  
public class ApartmentDaoImpl  implements ApartmentDao{  
  
	@Autowired
	ApartmentRepository apartmentRepository;

    @Override  
    public boolean saveApartment(ApartmentPojo apartmentPojo) {  

    	Apartment apartment = apartmentPojo.getApartmentConvetor(apartmentPojo);
        apartmentRepository.save(apartment);  
        return true;  
    }  
  
    @Override  
    public Apartment getApartmentByName(String apartmentName) {  
    //    Session currentSession = sessionFactory.getCurrentSession();  
    //    Query<Student> query=studentRepository.createQuery("from Student", Student.class);  
    	return apartmentRepository.findByName(apartmentName);
    }  
  
    @Override  
    public boolean deleteApartment(String apartmentName) {  
    	apartmentRepository.deleteByName(apartmentName);  
        return true;  
    }

	@Override
	public List<String> findallActiveApartment() {
		return apartmentRepository.findallActiveApartment();
	}

	@Override
	public boolean updateApartment(Apartment apartment) {
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