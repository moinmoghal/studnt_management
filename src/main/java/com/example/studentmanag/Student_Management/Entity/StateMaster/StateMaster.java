package com.example.studentmanag.Student_Management.Entity.StateMaster;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="state_master")
public class StateMaster 
{
	
@NotNull
@Id
private int state_id;

@Column(nullable = false, unique = true)
@NotNull
private String state_name;


@NotNull
private int country_id;


public int getState_id() {
	return state_id;
}


public void setState_id(int state_id) {
	this.state_id = state_id;
}


public String getState_name() {
	return state_name;
}


public void setState_name(String state_name) {
	this.state_name = state_name;
}


public int getCountry_id() {
	return country_id;
}


public void setCountry_id(int country_id) {
	this.country_id = country_id;
}



}