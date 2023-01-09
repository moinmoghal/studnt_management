package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.StateMaster.StateMaster;
@Repository
public interface StateRepository extends JpaRepository<StateMaster, Integer> 

{
@Query("SELECT u FROM StateMaster u where u.state_name = ?1")
	StateMaster findByState_Name(String state_name);
	
}
