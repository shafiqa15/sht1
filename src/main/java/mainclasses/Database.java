package mainclasses;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class Database {
   protected static final  List <user> dbuser=new ArrayList <user> ();
	 List <Furniture> dbfurniture=new ArrayList <Furniture>();
	 List <Apartment> dbapartment=new ArrayList <Apartment>();
	 
 private static final Logger logger = Logger.getLogger(Database.class.getName());
String newtenant="new tenant";
public  void login(String email,String password)
		{ 
    user obj0=new user();
    dbuser.add(obj0);
 	obj0.email="haya@gmail.com";
	obj0.password="haya123";
	dbuser.add(obj0);	
	
	  user obj1=new user();

         	obj1.email=email;
			obj1.password=password;
			

		if (!dbuser.contains(obj1)) {
			dbuser.add(obj1);	
		    logger.info(newtenant); 
	
		}
	
		
		else
			 logger.info("this tenant already exists!"); 

					
	
  
     


		}
public void showWhichTenant(String id) {
	
	owner own=new owner();
	
	for(int i=0;i<dbuser.size();i++) {
		if(dbuser.get(i).id.equals(id)) {
		
			 logger.info( own.id  +             own.name     +"\n ");
			
		}
	}
}
  
public  void addTenantStudent(String email,String password,String name,String type,String major,int age,String id)
{
	user obj0=new user(email, password, name, type, major, age,id);
	 if (!dbuser.contains(obj0))
	 {
		    obj0.type="Student";
		    dbuser.add(obj0);
			
		    logger.info(newtenant);
		    
		    
		    
		    
     }
		for(int i=0;i<dbuser.size();i++) {
			 //logger.info(db_user.get(i).type+db_user.get(i).password+db_user.get(i).name+db_user.get(i).major);		
		}
		
		 user obj2=new user();
	     obj2.setAddress("Awarta");
	     obj2.setEmail("shaf@gmail.com");
	     obj2.setName("SHAFIQA");
	     obj2.setId("4");
	     obj2.setAge(20);
	     obj2.setMajor("CE");
	     obj2.type="student";

	     dbuser.add(obj2);
	     
	  user obj3=new user();
	  obj3.setAddress("Awarta");
	  obj3.setEmail("AHMAD@GMAIL.COM");
	  obj3.setName("AHMAD");
	  obj3.setId("5");
	  obj3.setAge(24);
	  obj3.setMajor("MEDICINE");
	  obj3.type="student";

	  dbuser.add(obj3);
	  
	  
	  
	  
	  
	  
	  
	 
	
	
}
public  void AddTenantNotStudent(String email,String password,String name,String type,String major,int age,String id)
{
	user obj0=new user(email, password, name, type, major, age,id);
	 if (!dbuser.contains(obj0))
	 {
		    obj0.type="Not Student";
		    obj0.major="";
		    obj0.age=0;
		    obj0.name="";
		    
		    dbuser.add(obj0);	
			
		    logger.info(newtenant);
    }
		for(int i=0;i<dbuser.size();i++) {
			 //logger.info(db_user.get(i).type+db_user.get(i).password+db_user.get(i).name+db_user.get(i).major);		
		}
}

public void addFurniture(String furniture,String cost_furniture) {
	Furniture obj0=new Furniture();
			obj0.type1=furniture;
			obj0.cost=cost_furniture;
	 if (!dbfurniture.contains(obj0))
		 
	 {
		 dbfurniture.add(obj0);
		 
		 for(int i=0;i<dbfurniture.size();i++) {
			// logger.info(db_Furniture.get(i).type1+db_Furniture.get(i).cost);
	 }
	 }
	 
	
}



public void addBuilding(Apartment obj) {
 
	 for(int i=0;i<dbapartment.size();i++) {
		 dbapartment.add(obj);
		// logger.info("\n" +db_Apartment.get(i).floor);
	 }
}

public void ViewHousing2(Apartment obj1) {
	 for(int i=0;i<dbapartment.size();i++) {
		 Apartment obj2=new Apartment();
		 obj2.setId(obj1.getId());
		 obj2.setRent(obj1.getRent());
		 obj2.setLocation(obj1.getLocation());
		 obj2.setWater(obj1.getWater());
		 obj2.setElectric(obj1.getElectric());
		 obj2.setBalcony(obj1.getBalcony());
		 obj2.setInternet(obj1.getInternet());
		 obj2.setBathrooms(obj1.getBathrooms());
		 obj2.setBedrooms(obj1.getBedrooms());
		 obj2.setPicture(obj1.getPicture());
		 obj2.setDate(obj1.date);
		 obj2.setBuildingId(obj1.getBuildingId());
		 obj2.setFloor(obj1.getFloor());
		 obj2.setNumberOfApartmentsInFloor(obj1.getNumberOfApartmentsInFloor());
		 dbapartment.add(obj2);
		 if(obj1.getId().equals(obj2.getId())) {
			 ViewHousing(obj1);
		 }
	 }
	
}




public void ViewHousing(Apartment obj1) {
	 for(int i=0;i<dbapartment.size();i++) {
		 Apartment obj2=new Apartment();
		 obj2.setId(obj1.getId());
		 obj2.setRent(obj1.getRent());
		 obj2.setLocation(obj1.getLocation());
		 obj2.setWater(obj1.getWater());
		 obj2.setElectric(obj1.getElectric());
		 obj2.setBalcony(obj1.getBalcony());
		 obj2.setInternet(obj1.getInternet());
		 obj2.setBathrooms(obj1.getBathrooms());
		 obj2.setBedrooms(obj1.getBedrooms());
		 obj2.setPicture(obj1.getPicture());
		 obj2.setDate(obj1.date);
		 obj2.setBuildingId(obj1.getBuildingId() );
		 obj2.setFloor(obj1.getFloor());
		 obj2.setNumberOfApartmentsInFloor(obj1.getNumberOfApartmentsInFloor());
		 dbapartment.add(obj2);
		/* logger.info("\n" +db_Apartment.get(i).id +db_Apartment.get(i).rent + db_Apartment.get(i).location+ 
	 db_Apartment.get(i).water	 +  db_Apartment.get(i).electric+ db_Apartment.get(i).balcony + db_Apartment.get(i).internet+ 
	 db_Apartment.get(i).balcony+ db_Apartment.get(i).bedrooms +db_Apartment.get(i).picture
	 + db_Apartment.get(i).date+db_Apartment.get(i).residence_name +db_Apartment.get(i).residence_id+ 
	 db_Apartment.get(i).floor+ db_Apartment.get(i).number_of_apartments);*/
		 
		 
	 }
	 
}
	


}