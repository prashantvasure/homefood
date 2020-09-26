package com.dao;  
  
import java.util.List;

import com.model.Apartment;
import com.pojo.ApartmentPojo;  
  
public interface ApartmentDao {  
  
    public boolean saveApartment(ApartmentPojo apartmentPojo);  
    public Apartment getApartmentByName(String name);  
    public boolean deleteApartment(String name);  
    public boolean updateApartment(Apartment partment);  
    public List<String> findallActiveApartment();  
}  