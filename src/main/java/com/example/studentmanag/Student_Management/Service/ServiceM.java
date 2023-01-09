package com.example.studentmanag.Student_Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.studentmanag.Student_Management.Entity.CityMaster.CityMaster;
import com.example.studentmanag.Student_Management.Entity.CountryMaster.CountryMaster;
import com.example.studentmanag.Student_Management.Entity.DegreeMaster.DegreeMaster;
import com.example.studentmanag.Student_Management.Entity.GradeMaster.GradeMaster;
import com.example.studentmanag.Student_Management.Entity.MarksMaster.MarksMaster;
import com.example.studentmanag.Student_Management.Entity.StateMaster.StateMaster;
import com.example.studentmanag.Student_Management.Entity.Student.Studnt;
import com.example.studentmanag.Student_Management.Entity.SubjectMaster.SubjectMaster;
import com.example.studentmanag.Student_Management.Entity.UniversityMaster.UniversityMaster;
import com.example.studentmanag.Student_Management.Repository.CityRepository;
import com.example.studentmanag.Student_Management.Repository.CountryRepository;
import com.example.studentmanag.Student_Management.Repository.DegreeRepository;
import com.example.studentmanag.Student_Management.Repository.GradeRepository;
import com.example.studentmanag.Student_Management.Repository.MarksRepository;
import com.example.studentmanag.Student_Management.Repository.MarksRepository;
import com.example.studentmanag.Student_Management.Repository.StateRepository;
import com.example.studentmanag.Student_Management.Repository.StudntRepository;
import com.example.studentmanag.Student_Management.Repository.SubjectRepository;
import com.example.studentmanag.Student_Management.Repository.UniversityRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
public class ServiceM

{

	@Autowired
	private StudntRepository studntRepository;

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private UniversityRepository universityRepository;
	
	@Autowired
	private DegreeRepository degreeRepository;

	@Autowired
	private SubjectRepository subjectRepository;

	@Autowired
	private GradeRepository gradeRepository;
	
	@Autowired MarksRepository marksRepository;
	
	////////// STUDENT POST METHODS \\\\\\\\\\\\\\\\\\\
	public Studnt saveStudnt(Studnt studnt) {
		Studnt findByroll_no = studntRepository.findByroll_no(studnt.getRoll_no());
		if (findByroll_no == null) {
			return studntRepository.save(studnt);
		} else {
			throw new RuntimeException("ROLL NO ALREADY EXISTS" + " PLEASE ENTER A VALID ROLL NO !!!!!!");

		}

	}

	public List<Studnt> saveStudnts(List<Studnt> students) {
		return studntRepository.saveAll(students);
	}

	/////////////// GET METHODS \\\\\\\\\\\\\\\\\\

	public List<Studnt> getStudents() {
		return studntRepository.findAll();
	}

	public String deleteStudents(int id) {
		studntRepository.deleteById(id);
		return "Details Of Student Removed!!!...";
	}

	//////////////////////////////// SAVE / PUT(UPDATE
	//////////////////////////////// METHOD)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	public Studnt updateStudnt(Studnt studnt) {
		Studnt existingStudnt = studntRepository.findById(studnt.getStud_id()).orElse(null);

		existingStudnt.setStud_id(studnt.getStud_id());
		existingStudnt.setName(studnt.getName());
		existingStudnt.setRoll_no(studnt.getRoll_no());
		existingStudnt.setUniversity_id(studnt.getUniversity_id());
		existingStudnt.setCountry_id(studnt.getCountry_id());
		existingStudnt.setState_id(studnt.getState_id());
		existingStudnt.setCity_id(studnt.getCity_id());
		existingStudnt.setCreated_by(studnt.getCreated_by());
		existingStudnt.setCreated_on_date(studnt.getCreated_on_date());
		existingStudnt.setUpdated_by(studnt.getUpdated_by());
		existingStudnt.setUpdated_on_date(studnt.getUpdated_on_date());
		return studntRepository.save(existingStudnt);
	}

	/////////////////// SAVE COUNTRY MASTER
	/////////////////// ////////////////////////////////////////////////////////////////
	public CountryMaster saveCountry(CountryMaster countryMaster) {
		CountryMaster findbyName = countryRepository.findByCountry_name(countryMaster.getCountry_name());
		if (findbyName == null) {
			return countryRepository.save(countryMaster);
		} else {
			throw new RuntimeException("COUNTRY ALREADY EXISTS");
		}

	}

	////////////////// UPDATE COUNTRY\\\\\\\\\\\\\\\\\
	public CountryMaster updateCountry(CountryMaster countryMaster) {
		CountryMaster existingCountry = countryRepository.findById(countryMaster.getCountry_id()).orElse(null);
		if (existingCountry == null) {
			throw new RuntimeException("COUNTRY DOES NOT EXISTS");
		} else {
			// CountryMaster findbyName =
			// countryRepository.findByCountry_name(existingCountry.getCountry_name());
			String old_ountry_name = existingCountry.getCountry_name();
			String country_name = countryMaster.getCountry_name();

			if (old_ountry_name.equalsIgnoreCase(country_name)) {
				// same rage to no need for update
				throw new RuntimeException("COUNTRY ALREADY UPDATED ONCE");
			} else {
				existingCountry.setCountry_id(countryMaster.getCountry_id());
				existingCountry.setCountry_name(country_name);
				return countryRepository.save(existingCountry);

			}

		}

////		CountryMaster existingCountry = countryRepository.findById(countryMaster.getCountry_id()).orElse(null);
////		if (existingCountry == null) {
////			throw new RuntimeException("COUNTRY is not EXISTS");
////		} else {
//			CountryMaster existingCountry = countryRepository.findByCountry_name(countryMaster.getCountry_name());
//			if (existingCountry != null) {
//				existingCountry.setCountry_id(countryMaster.getCountry_id());
//				existingCountry.setCountry_name(countryMaster.getCountry_name());
//				return countryRepository.save(existingCountry);
//			} else {
//				throw new RuntimeException("COUNTRY is already EXISTS");
//			}
//		//}
	}

	/////////////////// SAVE STATE MASTER \\\\\\\\\\\\\\\\\\\\\\\\\\

	public StateMaster saveStates(StateMaster stateMaster) {
		StateMaster findByStateName = stateRepository.findByState_Name(stateMaster.getState_name());
		if (findByStateName == null) {
			return stateRepository.save(stateMaster);
		} else {
			throw new RuntimeException("NO DUPLICATE STATES ARE ALLOWED");
		}
	}

	//////////////// UPDATE STATE MASTER \\\\\\\\\\\\\\\\\\\\\\
	public StateMaster updateState(StateMaster stateMaster) {

		StateMaster existingMaster = stateRepository.findById(stateMaster.getState_id()).orElse(null);
		String oldcountry = existingMaster.getState_name();
		String state_name = stateMaster.getState_name();

		if (oldcountry.equalsIgnoreCase(state_name)) {
			throw new RuntimeException("STATE ALREADY EXITS");
		} else {
			existingMaster.setState_id(stateMaster.getState_id());
			existingMaster.setState_name(stateMaster.getState_name());
			return stateRepository.save(existingMaster);
		}

	}
	//////////////////// City Master\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	public CityMaster saveCity(CityMaster cityMaster) {
		CityMaster findByCityName = cityRepository.findByCity_Name(cityMaster.getCity_name());
		if (findByCityName == null) {
			return cityRepository.save(cityMaster);
		} else {
			throw new RuntimeException("NO DUPLICATE CITY ALLOWED ....!!!!!!");
		}

	}

	///// UPDATE CITY \\\\\\\\\\\\\\\\\

	public CityMaster updateCity(CityMaster cityMaster) {
		CityMaster existingCity = cityRepository.findById(cityMaster.getCity_id()).orElse(null);

		existingCity.setCity_id(cityMaster.getCity_id());
		existingCity.setCity_name(cityMaster.getCity_name());
		return cityRepository.save(existingCity);
	}

	////////////////// University Master\\\\\\\\\\\\\\\\\\\\\

	public UniversityMaster saveUniversity(UniversityMaster universityMaster) {
		UniversityMaster findByUniv = universityRepository.findByUniversity_Name(universityMaster.getUniversity_name());
		if (findByUniv == null) {
			return universityRepository.save(universityMaster);
		} else {
			throw new RuntimeException("NO DUPLICATE UNIVERSITY ALLOWED !!!!!!");
		}

	}
	////////////////// UPDATE UNIVERSITY \\\\\\\\\\\\\\\

	public UniversityMaster updateUniversity(UniversityMaster universityMaster) {
		UniversityMaster existingUniversity = universityRepository
				.findByUniversity_Name(universityMaster.getUniversity_name());
		String old_university_name = existingUniversity.getUniversity_name();
		String university_name = universityMaster.getUniversity_name();
		if (old_university_name.equalsIgnoreCase(university_name)) {
			throw new RuntimeException("UNIVERSITY ALREADY UPDATED !!!!!!!!!!!!");

		}

		else {
			existingUniversity.setUniversity_id(universityMaster.getUniversity_id());
			existingUniversity.setUniversity_name(universityMaster.getUniversity_name());
			return (universityRepository.save(existingUniversity));

		}

	}

	///////////////////////////// SAVE DEGREE \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ 
	public DegreeMaster saveDegree(DegreeMaster degreeMaster)

	{
		DegreeMaster findBydegree = degreeRepository.findByDegree_name(degreeMaster.getDegree_name());
		if(findBydegree == null)
		{
		return degreeRepository.save(degreeMaster);
	    }
		else
		{
			throw new RuntimeException("NO DUPLICATE DEGREE ALLOWED");
		}
	
	}
/////////////////////////////// UPDATE DEGREE \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\	
	public DegreeMaster updateDegree(DegreeMaster degreeMaster) 
	{
		DegreeMaster existingDegree = degreeRepository.findById(degreeMaster.getDegree_id()).orElse(null);
		{
			String old_degree_name = existingDegree.getDegree_name();
			String degre_name = degreeMaster.getDegree_name();
			if(old_degree_name.equalsIgnoreCase(degre_name))
			{
				throw new RuntimeException("DEGREE NAME ALREADY UPDATED");
			}
			else
			{
			existingDegree.setDegree_id(degreeMaster.getDegree_id());
			existingDegree.setDegree_name(degreeMaster.getDegree_name());
			existingDegree.setAcademic_year(degreeMaster.getAcademic_year());
			existingDegree.setCreated_by(degreeMaster.getCreated_by());
			existingDegree.setUpdated_by(degreeMaster.getUpdated_by());
			return degreeRepository.save(existingDegree);
		    }
	
	
	}
}
	
	////////////////////////// SAVE SUBJECT \\\\\\\\\\\\\\\\\\\
	
	public SubjectMaster saveSubject (SubjectMaster subjectMaster)
	{
		SubjectMaster findBySub = subjectRepository.findBySub(subjectMaster.getSubject_name());
		if(findBySub == null)
		{
			return subjectRepository.save(subjectMaster);
		}
		else
		{
			throw new RuntimeException("NO DUPLICATE SUBJECTS ALLOWED");
		}
		
	}
	
	//////////////// UPDATE SUBJECT \\\\\\\\\\\\\\\\\\\\\\
	public SubjectMaster updateSub (SubjectMaster subjectMaster)
	{
		SubjectMaster existingSubject = subjectRepository.findById(subjectMaster.getSubject_id()).orElse(null);
		String old_subject_name = existingSubject.getSubject_name();
		String subjectname = subjectMaster.getSubject_name();
		if(old_subject_name.equalsIgnoreCase(subjectname))
		{
			throw new RuntimeException("SUBJECT ALREADY UPDATED");
		}
		
		else
		{
		existingSubject.setSubject_name(subjectMaster.getSubject_name());
		existingSubject.setTotal_Marks(subjectMaster.getTotal_Marks());
		existingSubject.setMin_Marks(subjectMaster.getMin_Marks());
		existingSubject.setCreated_by(subjectMaster.getCreated_by());
		existingSubject.setUpdated_by(subjectMaster.getUpdated_by());
		return subjectRepository.save(subjectMaster);
	}
}
	
	//////////////// SAVE GRADE \\\\\\\\\\\\\\\\\
	
	public GradeMaster saveGrade (GradeMaster gradeMaster)
	{
		return gradeRepository.save(gradeMaster);
	}
	
	public GradeMaster updateGrade (GradeMaster gradeMaster)
	{
		GradeMaster existingGrade = gradeRepository.findById(gradeMaster.getGrade_id()).orElse(null);
		existingGrade.setGrade_name(gradeMaster.getGrade_name());
		existingGrade.setSubject_id(gradeMaster.getSubject_id());
		existingGrade.setRange_from(gradeMaster.getRange_from());
		existingGrade.setRange_to(gradeMaster.getRange_to());
		return gradeRepository.save(existingGrade);
	}
	
	/////////////////////// MARKS SAVE/UPDATE \\\\\\\\\\\\\\\\\\\
	
	public MarksMaster saveMarks(MarksMaster marksMaster)
	{
		return marksRepository.save(marksMaster);
	}
	
	public MarksMaster updateMarks(MarksMaster marksMaster)
	{
		return marksRepository.save(marksMaster);
	}
}



