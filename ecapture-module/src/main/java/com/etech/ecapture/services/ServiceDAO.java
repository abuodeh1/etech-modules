package com.etech.ecapture.services;

import java.util.List;

public interface ServiceDAO<T, ID> {

	public T get(ID entityID);
	public List<T> getAll();
	public void save(T entity);
	public void save(List<T> entity);
	public void delete(T entity);
	public void delete(List<T> entity);	
	
}
