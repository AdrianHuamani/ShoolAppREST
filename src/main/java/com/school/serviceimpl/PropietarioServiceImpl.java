package com.school.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Propietario;
import com.school.repo.IGenericRepo;
import com.school.repo.IPropietarioRepo;
import com.school.service.IPropietarioService;

@Service
public class PropietarioServiceImpl extends CRUDImpl<Propietario,Integer> implements IPropietarioService{

	@Autowired
	private IPropietarioRepo repo;

	@Override
	protected IGenericRepo<Propietario, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
}
