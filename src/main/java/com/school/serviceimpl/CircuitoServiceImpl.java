package com.school.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Circuito;
import com.school.repo.ICircuitoRepo;
import com.school.repo.IGenericRepo;
import com.school.service.ICircuitoService;

@Service
public class CircuitoServiceImpl extends CRUDImpl<Circuito,Integer> implements ICircuitoService{

	@Autowired
	ICircuitoRepo repo;

	@Override
	protected IGenericRepo<Circuito, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	
	
	
}
