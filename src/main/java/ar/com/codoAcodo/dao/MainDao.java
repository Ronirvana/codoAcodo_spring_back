package ar.com.codoAcodo.dao;

import java.util.Collection;

import ar.com.codoAcodo.dao.entity.Socio;

public class MainDao {

	public static void main(String[] args) {

		// quiero datos de la tabla socios
		SocioRepositoryImpl s = new SocioRepositoryImpl();
		Collection<Socio> list = s.findAll();
		Socio socio = s.findByID(1L);

		OrdenRepositoryImpl o = new OrdenRepositoryImpl();
		Collection<Orden> ordenes = o.findAll();
		Orden orden = o.findByID(1L);

	}

}
