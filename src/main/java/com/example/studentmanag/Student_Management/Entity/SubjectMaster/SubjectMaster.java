package com.example.studentmanag.Student_Management.Entity.SubjectMaster;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="subject_master")
public class SubjectMaster

{

	@Id
	@NotNull
	private int subject_id;
	
	@NotNull
    private int degree_id;
	
	@NotNull
	private String subject_name;
	
	@NotNull
	private int total_Marks;
	
	@NotNull
	private int min_Marks;
	
	
	@NotNull
	private String created_by;

	@NotNull
	private String updated_by;
	
	@NotNull
	private int Year;

	
	
	

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public int getDegree_id() {
		return degree_id;
	}

	public void setDegree_id(int degree_id) {
		this.degree_id = degree_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public int getTotal_Marks() {
		return total_Marks;
	}

	public void setTotal_Marks(int total_Marks) {
		this.total_Marks = total_Marks;
	}

	public int getMin_Marks() {
		return min_Marks;
	}

	public void setMin_Marks(int min_Marks) {
		this.min_Marks = min_Marks;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	
	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		this.Year = year;
	}
	
}
