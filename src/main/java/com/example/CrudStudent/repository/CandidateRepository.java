package com.example.CrudStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudStudent.pojo.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository <Candidate,Integer>{

}
