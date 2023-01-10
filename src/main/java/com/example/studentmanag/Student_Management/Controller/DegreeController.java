package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.DegreeMaster.DegreeMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController
public class DegreeController 

{
    @Autowired
	private ServiceM serv;
    
    @PostMapping("/addDegree")
    public DegreeMaster add_degree(@RequestBody DegreeMaster degreeMaster)
    {
    	return serv.saveDegree(degreeMaster);
    }
	
    @PostMapping("/updateDegree")
    public DegreeMaster addup_degree(@RequestBody DegreeMaster degreeMaster)
    {
    	return serv.updateDegree(degreeMaster);
    }
	
  
}
