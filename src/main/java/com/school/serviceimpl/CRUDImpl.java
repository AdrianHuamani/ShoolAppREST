package com.school.serviceimpl;

import java.util.List;


import com.school.repo.IGenericRepo;
import com.school.service.ICRUD;

public abstract class CRUDImpl<T,ID> implements ICRUD<T,ID>{

	protected abstract IGenericRepo<T,ID> getRepo();
	
	@Override
	public List<T> listar() throws Exception {
		// TODO Auto-generated method stub
		return getRepo().findAll();
	}

	@Override
	public T listarPorId(ID id) throws Exception {
		// TODO Auto-generated method stub
		return getRepo().findById(id).orElse(null);
	}

	@Override
	public T registrar(T t) throws Exception {
		// TODO Auto-generated method stub
		return getRepo().save(t);
	}

	@Override
	public T modificar(T t) throws Exception {
		// TODO Auto-generated method stub
		return getRepo().save(t);
	}

	@Override
	public void eliminar(ID id) throws Exception {
		getRepo().deleteById(id);
		
	}

}
