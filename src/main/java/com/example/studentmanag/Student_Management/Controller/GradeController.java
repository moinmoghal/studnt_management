package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.GradeMaster.GradeMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;


@RestController
public class GradeController 

{
@Autowired
private ServiceM serv;

@PostMapping("/addGrade")
public GradeMaster add_Grade(GradeMaster gradeMaster)
{
	return serv.saveGrade(gradeMaster);
}
@PostMapping("/abc")
public GradeMaster update_grad(GradeMaster gradeMaster)
{
	return serv.updateGrade(gradeMaster);
}
//THIS IS A GRADE CINTROLLER CLASS OF PROJECT STUDENT MANAGEMENT
}
