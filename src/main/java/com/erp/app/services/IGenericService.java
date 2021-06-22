package com.erp.app.services;

import java.util.List;

public interface IGenericService <T, K> {
	
	public List<T> findAll();
	
	public void save (T t);
	
	public T findById(K k);

}
