package com.ss.contact.service;

import java.util.List;
import java.util.Optional;

import com.ss.contact.entity.ContactEntity;

public interface ContactService {
	public String saveContact(ContactEntity entity);
	public String saveContacts(List<com.ss.contact.entity.ContactEntity> entities);
	public  Optional<com.ss.contact.entity.ContactEntity> getContactById(Integer contactId);
	public List<ContactEntity>  getAllContacts();
 }
