package com.bway.springproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "department_tbl")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Department name is required")
	private String name;
	@NotBlank(message = "Department Phone is required")
	private String deptPhone;
	@NotBlank(message = "Department Head is required")
	private String deptHead;

}
