package com.example.studentmanag.Student_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanag.Student_Management.Entity.DegreeMaster.DegreeMaster;

@Repository
public interface DegreeRepository extends JpaRepository<DegreeMaster, Integer>

{
    @Query("SELECT u from DegreeMaster u where u.degree_name =?1")
	DegreeMaster findByDegree_name(String degree_name);
}
