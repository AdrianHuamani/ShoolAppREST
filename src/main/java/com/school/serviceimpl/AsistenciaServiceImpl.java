package com.school.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Asistencia;
import com.school.repo.IAsistenciaRepo;
import com.school.repo.IGenericRepo;
import com.school.service.IAsistenciaService;

@Service
public class AsistenciaServiceImpl extends CRUDImpl<Asistencia,Integer> implements IAsistenciaService{

	@Autowired
	private IAsistenciaRepo repo;

	@Override
	protected IGenericRepo<Asistencia,Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
}
