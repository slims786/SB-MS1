package com.ss.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.contact.entity.ContactEntity;
import com.ss.contact.repository.ContactRepository;



@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
    private ContactRepository cntctRpo;
	
	@Override
	public String saveContact(ContactEntity entity) {
		System.out.println("Class name of repository: "+cntctRpo.getClass().getName());
		ContactEntity saveEntity = cntctRpo.save(entity);
		if(saveEntity!= null)
			return "Contact Save Successfully";
		else
			return "Contact is not Saved";
	}
	
	
	@Override
	public String saveContacts(List<ContactEntity> entities) {
		Iterable<ContactEntity> saveEntities = cntctRpo.saveAll(entities);
		if(saveEntities!=null)
		return "All Contacts are saved";
		else
		return "Contacts are not saved";
	}


	@Override
	public Optional<ContactEntity> getContactById(Integer contactId) {
		Optional<ContactEntity> option = cntctRpo.findById(contactId);
		if(option.isPresent()){
			option.get();
		}
		return option;
	}


	@Override
	public List<ContactEntity> getAllContacts() {
		List<ContactEntity> contacts = (List<ContactEntity>) cntctRpo.findAll();
		return contacts;
	}
}
