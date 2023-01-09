package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.StateMaster.StateMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController
public class StateController 
{

	@Autowired
	private ServiceM serv;
	
	@PostMapping("/SaveState")
	public StateMaster addState (@RequestBody StateMaster stateMaster)
	{
	return	serv.saveStates(stateMaster);
	}
	
	@PutMapping("/UpdateState")
	public StateMaster updateState (@RequestBody StateMaster stateMaster)
	{
		return serv.updateState(stateMaster);
	}
}
