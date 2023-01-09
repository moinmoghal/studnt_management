package com.example.studentmanag.Student_Management.Entity.MarksMaster;

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
@Table(name="marks_master")
public class MarksMaster 

{
	@Id
	@NotNull
 private int marks_id;
 
 private int stud_id;
 
 private int university_id;
 
 private int degree_id;
 
 private int marks_obtained;
 
 private int  subject_id;

 
 
public int getMarks_id() {
	return marks_id;
}

public void setMarks_id(int marks_id) {
	this.marks_id = marks_id;
}

public int getStud_id() {
	return stud_id;
}

public void setStud_id(int stud_id) {
	this.stud_id = stud_id;
}

public int getUniversity_id() {
	return university_id;
}

public void setUniversity_id(int university_id) {
	this.university_id = university_id;
}

public int getDegree_id() {
	return degree_id;
}

public void setDegree_id(int degree_id) {
	this.degree_id = degree_id;
}

public int getMarks_obtained() {
	return marks_obtained;
}

public void setMarks_obtained(int marks_obtained) {
	this.marks_obtained = marks_obtained;
}

public int getSubject_id() {
	return subject_id;
}

public void setSubject_id(int subject_id) {
	this.subject_id = subject_id;
}
 
 
 
}
