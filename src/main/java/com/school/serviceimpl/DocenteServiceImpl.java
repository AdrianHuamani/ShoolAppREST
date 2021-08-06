package com.school.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Docente;
import com.school.repo.IDocenteRepo;
import com.school.repo.IGenericRepo;
import com.school.service.IDocenteService;

@Service
public class DocenteServiceImpl extends CRUDImpl<Docente,Integer> implements IDocenteService{

	@Autowired
	private IDocenteRepo repo;

	@Override
	protected IGenericRepo<Docente,Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
}
