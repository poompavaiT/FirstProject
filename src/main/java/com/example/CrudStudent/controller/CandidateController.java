package com.example.CrudStudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudStudent.pojo.Candidate;
import com.example.CrudStudent.service.CandidateService;

@RestController
public class CandidateController {
	@Autowired
	CandidateService service;
	@GetMapping("/getcandidatedetails")
	private List<Candidate> getAllDetails()
	{
		return service.getAllDetails();
	}
	@PostMapping("/postcandidatedetails")
	private Candidate postCandidateDetails(@RequestBody Candidate candidate) 
	{
		return service.postCandidateDetails(candidate);
	}
	@DeleteMapping("/deletecandidatedetails/{cid}")
	private void deleteDetails(@PathVariable ("cid") int id)
	{
		 service.deleteDetails(id);
	}
	@GetMapping("/getparticularcandidate/{cid}")
	private Candidate getparticularcandidate(@PathVariable ("cid") int id)
	{
		return service.getparticulardetails(id);
	}


}
