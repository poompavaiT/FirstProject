package com.example.CrudStudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudStudent.pojo.Candidate;
import com.example.CrudStudent.repository.CandidateRepository;

@Service
public class CandidateService {
	@Autowired
	CandidateRepository repository;
	public List<Candidate> getAllDetails(){
		
		return repository.findAll();
	}
	public Candidate postCandidateDetails(Candidate candidate){
		return repository.save(candidate);
	}
	public Candidate getparticulardetails(int id)
	{
		return repository.findById(id).get();
	}


	
	public void deleteDetails(int id) {
		repository.deleteById(id);
		
	}
}
