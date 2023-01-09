package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.UniversityMaster.UniversityMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController
public class UniversityController 
{

	@Autowired
	private ServiceM serv;
	
	
	@PostMapping("/SaveUniv")
	public UniversityMaster saveUniversity(@RequestBody UniversityMaster universityMaster)
	{
		return serv.saveUniversity(universityMaster);
	}
	
	@PutMapping("/UpdateUniver")
	
	public UniversityMaster updateUniversity(@RequestBody UniversityMaster universityMaster)
	{
		return serv.updateUniversity(universityMaster);
	}
}
