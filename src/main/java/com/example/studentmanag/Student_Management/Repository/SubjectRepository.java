package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.SubjectMaster.SubjectMaster;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectMaster, Integer>

{
@Query("SELECT u from SubjectMaster u where u.subject_name = ?1")
 SubjectMaster findBySub (String subject_name);
}
