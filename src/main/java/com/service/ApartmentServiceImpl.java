package com.service;


import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
import com.dao.*;
import com.model.Apartment;
import com.pojo.ApartmentPojo;
@Service  
@Transactional  
public class ApartmentServiceImpl {  
  
   @Autowired  
   private ApartmentDao apartmentdao;  
     
   
   public boolean saveApartment(ApartmentPojo apartmentPojo) {  
       return apartmentdao.saveApartment(apartmentPojo);  
   }  
   
   public Apartment getApartmentByName(String apartmentName) {  
       return apartmentdao.getApartmentByName(apartmentName);
   }  
 
   public boolean deleteApartment(String apartmentName) {   
       return apartmentdao.deleteApartment(apartmentName);  
   }  
   
   public boolean updateApartment(Apartment apartment) { 
       return apartmentdao.updateApartment(apartment);  
   }  
 
}  