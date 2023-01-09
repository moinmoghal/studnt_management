package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.UniversityMaster.UniversityMaster;
@Repository
public interface UniversityRepository extends JpaRepository<UniversityMaster, Integer>

{
@Query(" SELECT u FROM UniversityMaster u WHERE u.university_name=?1 ")
	UniversityMaster findByUniversity_Name (String university_name);
}
