package com.school.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Curso;
import com.school.repo.ICursoRepo;
import com.school.repo.IGenericRepo;
import com.school.service.ICursoService;

@Service
public class CursoServiceImpl extends CRUDImpl<Curso,Integer> implements ICursoService{

	@Autowired
	private ICursoRepo repo;

	@Override
	protected IGenericRepo<Curso,Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
}
