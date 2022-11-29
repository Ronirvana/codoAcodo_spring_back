package ar.com.codoAcodo.dao;

import ar.com.codoAcodo.dao.entity.Socio;

public class SocioRepositoryImpl extends BaseRepository<Socio> implements SocioRepository {

	public SocioRepositoryImpl() {
		super("SOCIO", Socio.class);

	}

	@Override
	public Socio findByID(Long id) {

		return null;
	}

}
