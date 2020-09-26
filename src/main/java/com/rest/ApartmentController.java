package com.rest;


import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.service.ApartmentServiceImpl;
import com.model.Apartment;
import com.pojo.ApartmentPojo;
  
@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class ApartmentController {  
      
    @Autowired  
    private ApartmentServiceImpl apartmentservice;  
      
    // http://localhost:8888/api/save-contact
    @PostMapping("save-apartment")  
    public boolean saveApartment(@RequestBody ApartmentPojo apartmentPojo) { 
    	System.out.println(apartmentPojo.getApartmentname());
         return apartmentservice.saveApartment(apartmentPojo);  
    }  
      
    @GetMapping("apartment-list/{apartmentName}")  
    public Apartment apartment(@PathVariable("apartmentName") String apartmentName) {  
         return apartmentservice.getApartmentByName(apartmentName);
    }  
    
    // http://localhost:8888/api/delete-contact/3
    @DeleteMapping("delete-apartment/{apartmentName}")  
    public boolean deleteApartment(@PathVariable("apartmentName") String apartmentName) {  
       
        return apartmentservice.deleteApartment(apartmentName);  
    }  
  
  /*  @PostMapping("update-apartment/{Users_id}")  
    public boolean updateApartment(@PathVariable("Users_id") int users_id) {  
       
        return apartmentservice.updateApartment(users_id);  
    }*/  
}  