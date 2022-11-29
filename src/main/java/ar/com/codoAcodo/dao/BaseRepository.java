package ar.com.codoAcodo.dao;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseRepository<T> implements IRepository<T> {

	private Class<T> clazz;
	protected String tabla;

	public BaseRepository(String tabla, Class<T> clazz) {
		this.tabla = tabla;
		this.clazz = clazz;
	}

	@Override
	public Collection<T> findAll() {

		String sql = "select * from " + this.getTabla();

		System.out.println("ejecutando sql: " + sql);

		// Clase.select(sql)

		Collection<T> entitys = new ArrayList<>();

		return entitys;
	}

	public T findById(Long id) {

		String sql = " select * from" + this.getTabla() + " where id=" + id;

		System.out.println("Ejecutando sql: " + sql);

		return null;
	}

	private Class<T> getClazz() {
		return clazz;
	}

	private String getTabla() {
		return tabla;
	}
}
