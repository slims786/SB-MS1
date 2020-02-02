package com.ss.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_MASTER")
public class ContactEntity {
	@Id
	@Column(name="C_ID")
     private Integer contactId;
	@Column(name="C_NAME")
     private String contactName;
	@Column(name="C_NUM")
     private Long contactNum;
}
