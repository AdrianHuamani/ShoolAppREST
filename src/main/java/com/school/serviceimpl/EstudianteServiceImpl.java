package com.school.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Estudiante;
import com.school.repo.IEstudianteRepo;
import com.school.repo.IGenericRepo;
import com.school.service.IEstudianteService;

@Service
public class EstudianteServiceImpl extends CRUDImpl<Estudiante,Integer> implements IEstudianteService{

	@Autowired
	private IEstudianteRepo repo;

	@Override
	protected IGenericRepo<Estudiante, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	

}
