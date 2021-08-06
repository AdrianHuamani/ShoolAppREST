package com.school.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Clase;
import com.school.repo.IClaseRepo;
import com.school.repo.IGenericRepo;
import com.school.service.IClaseService;

@Service
public class ClaseServiceImpl extends CRUDImpl<Clase,Integer> implements IClaseService{

	@Autowired
	private IClaseRepo repo;

	@Override
	protected IGenericRepo<Clase,Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
}
