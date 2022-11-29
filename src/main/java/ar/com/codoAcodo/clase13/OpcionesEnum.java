package ar.com.codoAcodo.clase13;

enum OpcionesEnum {

	ALTA("ALTA"), BAJA("BAJA"), MODIFICAR("MODIFICAR"), ELIMINAR("ELIMINAR");

	private String key;

	private OpcionesEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

	public static OpcionesEnum getEnumByString(String filtro) {
		// recorrer los valores de enum, busqueda de un enum dado una clave
		OpcionesEnum[] _enums = OpcionesEnum.values();
		for (OpcionesEnum unEnum : _enums) {
			if (unEnum.getKey().equals(filtro.toUpperCase())) {
				// LOGICA
				return unEnum;
			}
		}
		throw new RuntimeException("No existe el enum " + filtro);
	}

}
