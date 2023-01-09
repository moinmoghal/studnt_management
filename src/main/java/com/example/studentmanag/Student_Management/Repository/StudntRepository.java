package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.Student.Studnt;


@Repository
public interface StudntRepository extends JpaRepository<Studnt, Integer> 

{

	Studnt getByName(String name);
	
	@Query("SELECT u FROM Studnt u WHERE u.roll_no = ?1")
    Studnt findByroll_no (int roll_no);
	
	
}
