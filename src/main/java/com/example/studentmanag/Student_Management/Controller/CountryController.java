package com.example.studentmanag.Student_Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanag.Student_Management.Entity.CountryMaster.CountryMaster;
import com.example.studentmanag.Student_Management.Service.ServiceM;

@RestController

public class CountryController 

{

	@Autowired
	private ServiceM serv;
	
////////////////////// SAVE COUNTRY \\\\\\\\\\\\\\\\\\\\\\\	
	@PostMapping("/CountrySave")
	
	public CountryMaster addCountry (@RequestBody CountryMaster countryMaster)
	{
		return serv.saveCountry(countryMaster);
	}
	
	@PutMapping("/CountryUpdate")
	public CountryMaster updateCountry (@RequestBody CountryMaster countryMaster)
	{
		return serv.updateCountry(countryMaster);
	}
	

	
	
}
