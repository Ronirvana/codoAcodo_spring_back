package ar.com.codoAcodo.dao;

public class OrdenRepositoryImpl extends BaseRepository<Orden> {

	public OrdenRepositoryImpl() {

		super("ORDEN", Orden.class);

	}

	@Override
	public Orden findByID(Long id) {

		return null;
	}

}
