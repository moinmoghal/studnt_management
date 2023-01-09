package com.example.studentmanag.Student_Management.Controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.Student.Studnt;
import com.example.studentmanag.Student_Management.Repository.StudntRepository;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController
public class StudntCntroller 

{
@Autowired
private ServiceM serv;

@PostMapping("/save")

	public Studnt addStudnt(@RequestBody Studnt student)
	{
	return serv.saveStudnt(student);
    }

@PostMapping("/list")

public List<Studnt> listStudent(@RequestBody List <Studnt> studentss)
{
	return serv.saveStudnts(studentss);
}
	
@GetMapping("/listStudent")

public List<Studnt> findAllStudnts()
{
	return serv.getStudents();
}

@DeleteMapping("/deleteById/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return serv.deleteStudents(id);
	}

@PutMapping("/updatedeStudent")
public Studnt updateStudent(@RequestBody Studnt studnt)
{
	
	return serv.updateStudnt(studnt);
}




}

