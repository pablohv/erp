package com.erp.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.app.dao.IClienteDao;
import com.erp.app.entity.Cliente;

@Service
public class ClienteServiceImpl implements IGenericService<Cliente, Short>, IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public void save(Cliente t) {
		clienteDao.save(t);
	}

	@Override
	public Cliente findById(Short k) {
		return clienteDao.findById(k).orElse(null);
	}

	@Override
	public Cliente fetchByIdWithSitios(Short id) {
		return clienteDao.fetchByIdWithSitios(id);
	}

}
