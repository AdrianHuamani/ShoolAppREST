package com.school.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Matricula;
import com.school.repo.IMatriculaRepo;
import com.school.repo.IGenericRepo;
import com.school.service.IMatriculaService;

@Service
public class MatriculaServiceImpl extends CRUDImpl<Matricula,Integer> implements IMatriculaService{

	@Autowired
	private IMatriculaRepo repo;

	@Override
	protected IGenericRepo<Matricula,Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
}
