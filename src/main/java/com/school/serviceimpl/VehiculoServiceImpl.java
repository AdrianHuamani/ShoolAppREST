package com.school.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Vehiculo;
import com.school.repo.IVehiculoRepo;
import com.school.repo.IGenericRepo;
import com.school.service.IVehiculoService;

@Service
public class VehiculoServiceImpl extends CRUDImpl<Vehiculo,Integer> implements IVehiculoService{

	@Autowired
	private IVehiculoRepo repo;

	@Override
	protected IGenericRepo<Vehiculo,Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
}
