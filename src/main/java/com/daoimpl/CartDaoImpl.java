package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import com.dao.CartDao;
import com.model.Cart;
import com.pojo.CartPojo;
import com.repository.CartRepository;  

@Repository  
public class CartDaoImpl  implements CartDao{  

	@Autowired
	CartRepository cartRepository;

	@Override  
	public boolean saveCart(CartPojo cartPojo) {  

		Cart cart = cartPojo.getCartConvetor(cartPojo);
		cartRepository.save(cart);  
		return true;  
	}  

	@Override
	public boolean deleteItemCart(int userid, int itemid) {

		cartRepository.deleteById(userid, itemid);  
		return true;  
	}


	@Override
	public List<Cart> getCartByUserId(int userid) {
		return cartRepository.getCartByUserId(userid);
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