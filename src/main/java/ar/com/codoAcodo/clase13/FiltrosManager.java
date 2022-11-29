package ar.com.codoAcodo.clase13;

import java.util.HashMap;
import java.util.Map;

public class FiltrosManager {

	private static Map<OpcionesEnum, IFiltro> filtros;

	// bloques estáticos se ejecutan antes del constructor

	static {
		filtros = new HashMap<>();
		// filtros.put(OpcionesEnum.ALTA, new Alta());
		// filtros.put(OpcionesEnum.BAJA, new Baja());
		// filtros.put(OpcionesEnum.MODIFICAR, new Modificar());
		// filtros.put(OpcionesEnum.ELIMINAR, new Eliminar());
	}

	public static IFiltro getFiltroByEnum(OpcionesEnum _enum) {
		if (_enum == null) {
			throw new RuntimeException("No existe enum");
		}
		return filtros.get(_enum);
	}

}
