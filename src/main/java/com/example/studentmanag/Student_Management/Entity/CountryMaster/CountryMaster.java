package com.example.studentmanag.Student_Management.Entity.CountryMaster;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="country_master")
public class CountryMaster 

{
@Id
@NotNull
private int country_id;

@Column(nullable=false, unique=true)
@NotNull
private String country_name;




public int getCountry_id() {
	return country_id;
}

public void setCountry_id(int country_id) {
	this.country_id = country_id;
}

public String getCountry_name() {
	return country_name;
}

public void setCountry_name(String country_name) {
	this.country_name = country_name;
}




}
