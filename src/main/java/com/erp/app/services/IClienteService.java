package com.erp.app.services;

import com.erp.app.entity.Cliente;

public interface IClienteService {
	
	public Cliente fetchByIdWithSitios(Short id);

}
