package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.CountryMaster.CountryMaster;

@Repository
public interface CountryRepository extends JpaRepository<CountryMaster, Integer>

{
	// CountryMaster findbyName(String country_name);
	@Query("SELECT u FROM CountryMaster u WHERE u.country_name = ?1")
	CountryMaster findByCountry_name(String country_name);

}
