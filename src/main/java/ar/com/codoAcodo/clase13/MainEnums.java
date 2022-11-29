package ar.com.codoAcodo.clase13;

public class MainEnums {

	public static void main(String[] args) {

		/*
		 * String opc = "PEPE"; seleccionar(opc);
		 */

		// USAR LOS VALORES DE ENUM

		// RECIBO ALGO DEL FRONT
		String filtro = "ALTA";

		// valueOf
		// OpcionesEnum _enum = OpcionesEnum.valueOf(filtro);

		// busqueda de un enum dada la clave
		OpcionesEnum _enum = OpcionesEnum.getEnumByString(filtro);

		// pedir al manager

		IFiltro ifiltro = FiltrosManager.getFiltroByEnum(_enum);

		// usar los valores
		seleccionar(OpcionesEnum.ALTA);

	}

	public static void seleccionar(OpcionesEnum opciones) {

	}

	/*
	 * public static void seleccionar(String opcion) {
	 * 
	 * //opciones acotadas- ALTA, BAJA, MODIFICAR, BUSCAR if("ALTA".equals(opcion)){
	 * System.out.println("es " + opcion); } switch (opcion) { case "ALTA": {
	 * System.out.println("es " + opcion); break; } case "BAJA": {
	 * System.out.println("es " + opcion); } default: throw new
	 * IllegalArgumentException("Unexpected value: " + opcion ); }
	 * 
	 * }
	 */

}
