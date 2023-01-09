package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.CityMaster.CityMaster;
@Repository
public interface CityRepository extends JpaRepository<CityMaster, Integer> 

{
	@Query("SELECT u FROM CityMaster u WHERE u.city_name =?1")
  CityMaster findByCity_Name (String city_name);
  
	
}
