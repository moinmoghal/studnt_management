package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.SubjectMaster.SubjectMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController
public class SubjectController 
{
	
@Autowired
private ServiceM serv;

@PostMapping("/subjectadd")
public SubjectMaster add_subj(@RequestBody SubjectMaster subjectMaster)
{
	return serv.saveSubject(subjectMaster);
}

@PostMapping("/updating")
public SubjectMaster update(@RequestBody SubjectMaster subjectMaster)
{
	return serv.updateSub(subjectMaster);
}


}
