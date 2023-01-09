package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.MarksMaster.MarksMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController
public class MarksController 

{
@Autowired
private ServiceM serv;

@PostMapping("/markssave")
public MarksMaster add_mark (MarksMaster marksMaster)
{
	return serv.saveMarks(marksMaster);
}

@PostMapping("/mark_update")
public MarksMaster update_mark(MarksMaster marksMaster)
{
	return serv.updateMarks(marksMaster);
}
}
