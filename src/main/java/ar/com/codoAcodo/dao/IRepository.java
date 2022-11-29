package ar.com.codoAcodo.dao;

import java.util.Collection;

public interface IRepository<T> {

	public Collection<T> findAll();

	public T findByID(Long id);

}
