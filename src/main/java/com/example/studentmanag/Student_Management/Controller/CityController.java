package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.CityMaster.CityMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController
public class CityController

{
	@Autowired
	private ServiceM serv;

	@PostMapping("/SaveCity")
	public CityMaster addCity(@RequestBody CityMaster cityMaster) {
		return serv.saveCity(cityMaster);
	}

	@PutMapping("/UpdateCity")
	public CityMaster updateCity(@RequestBody CityMaster cityMaster) {
		return serv.updateCity(cityMaster);
	}
//THIS IS A CITY CONTROLLER OF THE STUDENT MANAGEMENT PROJECT
}
