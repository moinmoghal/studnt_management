package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.MarksMaster.MarksMaster;

@Repository
public interface MarksRepository extends JpaRepository<MarksMaster, Integer> 

{

}
