package com.ss.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ss.contact.entity.ContactEntity;
import com.ss.contact.service.ContactServiceImpl;

@SpringBootApplication
public class ContactAppSpringDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				                 SpringApplication.run(ContactAppSpringDataApplication.class, args);
		ContactServiceImpl service = ctx.getBean(ContactServiceImpl.class);
		
		ContactEntity entity = new ContactEntity();
		entity.setContactId(104);
		entity.setContactName("Sara");
		entity.setContactNum(9858751598L);
		
		String saveContact = service.saveContact(entity);
		System.out.println(saveContact);
		
		/*List<ContactEntity> contactEntities = new ArrayList<ContactEntity>();
		ContactEntity entity1 = new ContactEntity();
		entity1.setContactId(105);
		entity1.setContactName("saleema");
		entity1.setContactNum(9834841798l);
	    contactEntities.add(entity1);
	    
	    ContactEntity entity2 = new ContactEntity();
	    entity2.setContactId(106);
		entity2.setContactName("Ruby");
		entity2.setContactNum(9834944598l);
	    contactEntities.add(entity2);
	    
	    String saveContacts = service.saveContacts(contactEntities);
	    System.out.println(saveContacts);
	    
		Optional<ContactEntity> contact = service.getContactById(108);
		System.out.println(contact);
	    
	    Iterable<ContactEntity> allContacts = service.getAllContacts();
	    System.out.println(allContacts);
		*/
	}


}
