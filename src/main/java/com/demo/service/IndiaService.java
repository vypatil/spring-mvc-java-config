package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IndiaRepository;
import com.demo.entity.India;

@Service
public class IndiaService {
	
	@Autowired
		IndiaRepository repository;
	
	public boolean saveIndia(India i) {
		
		return repository.saveIndiaToDb(i);
		
	}
	
	public List<India> viewIndiaData(){
		
		return repository.viewAlldata();
				
	}	

}
