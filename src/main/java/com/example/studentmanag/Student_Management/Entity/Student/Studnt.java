package com.example.studentmanag.Student_Management.Entity.Student;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Studnt_Data")
public class Studnt

{
	@Id
	@GeneratedValue
	@NotNull
	private int stud_id;
	
	
	@NotNull
	private String name;
	
    @Column( nullable=false, unique=true)
	@NotNull
	private int roll_no;
	
	@NotNull
	private int university_id;
	
	@NotNull
	private int city_id;
	
	@NotNull
	private int state_id; 

	
	@NotNull
	private int country_id; 

	@NotNull
	private String created_by;
	
	private String updated_by;
	
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate created_on_date; 

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate updated_on_date;

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public int getUniversity_id() {
		return university_id;
	}

	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}

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

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
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

	public LocalDate getCreated_on_date() {
		return created_on_date;
	}

	public void setCreated_on_date(LocalDate created_on_date) {
		this.created_on_date = created_on_date;
	}

	public LocalDate getUpdated_on_date() {
		return updated_on_date;
	}

	public void setUpdated_on_date(LocalDate updated_on_date) {
		this.updated_on_date = updated_on_date;
	} 
	
	
	
	
	
}
