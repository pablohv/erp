package com.erp.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.erp.app.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Short> {
	
	@Query("select c from Sitio c fetch c.sitios s where c.id=?1")
	public Cliente fetchByIdWithSitios(Short id);

}
