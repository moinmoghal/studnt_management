package com.example.studentmanag.Student_Management.Entity.GradeMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="grade_master")
public class GradeMaster

{
@Id
@GeneratedValue
private int grade_id;

@NotNull
private int subject_id;

@NotNull
private String grade_name;


@NotNull
private int range_from;

@NotNull
private int range_to;


private String created_by;


private String updated_by;


public int getGrade_id() {
	return grade_id;
}


public void setGrade_id(int grade_id) {
	this.grade_id = grade_id;
}


public int getSubject_id() {
	return subject_id;
}


public void setSubject_id(int subject_id) {
	this.subject_id = subject_id;
}


public String getGrade_name() {
	return grade_name;
}


public void setGrade_name(String grade_name) {
	this.grade_name = grade_name;
}


public int getRange_from() {
	return range_from;
}


public void setRange_from(int range_from) {
	this.range_from = range_from;
}


public int getRange_to() {
	return range_to;
}


public void setRange_to(int range_to) {
	this.range_to = range_to;
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









}
