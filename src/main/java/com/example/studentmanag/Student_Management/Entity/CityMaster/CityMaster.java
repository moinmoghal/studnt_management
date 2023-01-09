package com.example.studentmanag.Student_Management.Entity.CityMaster;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="city_master")
public class CityMaster 

{
	
	@Id
	   @NotNull
	   private int city_id;
	   
	   @NotNull
	   private int state_id;
	   
	   @Column(nullable = false, unique = true)
	   @NotNull
	   private String city_name;
		
	
	
   public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}


	
}
