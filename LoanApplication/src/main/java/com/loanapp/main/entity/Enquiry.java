package com.loanapp.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryId ;
	private String customerName;
	private String pancardNumber;
	private long customerMobileNumber;
	private long customerAlternateMobileNumb;
	private String customerEmailId;
	private int customerDateOfBirth;  ;
	private int enquiryStatus; ;
	private int customerRegisterStatus ;

}
