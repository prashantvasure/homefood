package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] a) {
    	
        SpringApplication.run(SpringBootJpaApplication.class, a);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*  @Bean
  ApplicationRunner init(PersonRepository repository) {

	  Person p = new Person();
	  p.id = 2;
	  p.firstname ="asadasdadasds  jjjj";
	  p.email = "smitavhasure@gmail.com";
	  p.middlename = "Vhasure";
	  p.password  = "password";
	  repository.save(p);
	  
	  p = new Person();
	  p.id = 3;
	  p.firstname ="Pasadasdasd  jjjj";
	  p.email = "smitavhasure@gmail.com";
	  p.middlename = "Vhasure";
	  p.password  = "password";
	  repository.save(p);
	  
	  Iterable<Person> list = repository.findAll();
	  for(Person p1 : list) {
	      System.out.println(p1.email);
	      System.out.println(p1.firstname);
	      System.out.println(p1.middlename);
	      System.out.println(p1.password);
	  }
	  
    String[][] data = {
        {"Smita", "Vhasure", "300.12", "NDK"},
        {"creek", "Andrew", "100.75", "Piranha"},
        {"loaner", "Andrew", "75", "Necky"}
    };

    return args -> {
      Stream.of(data).forEach(array -> {
        Smita kayak = new Smita(
              array[0],
              array[1],
                  33,
              array[3]
          );
        System.out.println("sssssssssssssssssssssssssssssssssss");
        //  repository.save(kayak);
      });
    //  repository.findAll().forEach(System.out::println);
      //repository.save(kayak);
    };
  }
  */
}