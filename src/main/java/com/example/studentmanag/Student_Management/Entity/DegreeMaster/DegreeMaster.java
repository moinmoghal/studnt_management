package com.example.studentmanag.Student_Management.Entity.DegreeMaster;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name ="degree_master")

public class DegreeMaster 

{
  @Id
  @NotNull
  private int degree_id;
  
  @NotNull
  private int university_id;
  
  @NotNull
  
  @Column(nullable = false, unique = true)
  private String degree_name;
  
  @NotNull
  private String created_by;
  
  @NotNull
  private String updated_by;
  
  @NotNull
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private LocalDate academic_year;


  
  public int getDegree_id() {
	return degree_id;
}

public void setDegree_id(int degree_id) {
	this.degree_id = degree_id;
}

public int getUniversity_id() {
	return university_id;
}

public void setUniversity_id(int university_id) {
	this.university_id = university_id;
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

public LocalDate getAcademic_year() 
{
	return academic_year;
}

public void setAcademic_year( LocalDate academic_year) 
{
	this.academic_year = academic_year;
}

public String getDegree_name() {
	return degree_name;
}

public void setDegree_name(String degree_name) {
	this.degree_name = degree_name;
}

@Override
public String toString() {
	return "DegreeMaster [degree_id=" + degree_id + ", university_id=" + university_id + ", degree_name=" + degree_name
			+ ", created_by=" + created_by + ", updated_by=" + updated_by + ", academic_year=" + academic_year + "]";
}
  
}
