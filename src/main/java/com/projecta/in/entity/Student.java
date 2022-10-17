package com.projecta.in.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String first_name;

	private String last_name;

	private String dob;

	private String email;

	private String mobile_number;

	private String institute;

	private String branch;

	private String major;

	private int year_of_graduation;

	private int experience;

	private String address;

}
