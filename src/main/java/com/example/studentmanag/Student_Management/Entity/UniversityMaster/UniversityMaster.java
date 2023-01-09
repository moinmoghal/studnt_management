package com.example.studentmanag.Student_Management.Entity.UniversityMaster;

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
@Table(name="university_master")
public class UniversityMaster 

{

	@Id
	@NotNull
	private int university_id;
	
	@Column(nullable = false, unique = true)
	@NotNull
	private String university_name;

	public int getUniversity_id() {
		return university_id;
	}

	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}
	
	
}
