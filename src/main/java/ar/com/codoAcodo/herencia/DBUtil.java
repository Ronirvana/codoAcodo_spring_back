package ar.com.codoAcodo.herencia;

public class DBUtil {

	Articulo[] obtenerResultado(String claveBusqueda){

		Articulo primero = new Articulo("http://sitio.com.ar/img/img1.jpg", "titulo" + claveBusqueda, "Autor1", 4390);
		Articulo segundo = new Articulo("http://sitio.com.ar/img/img2.jpg", "titulo" + claveBusqueda, "Autor2", 40500);
		Articulo tercero = new Articulo("http://sitio.com.ar/img/img3.jpg", "titulo" + claveBusqueda, "Autor3", 2040);

		//crear un vector/array/arreglo
		//inicia en la posicion 0
		/*Articulo[] resultados = new Articulo[3];//vector vacio
		resultados[0] = primero;
		resultados[1] = segundo;
		resultados[2] = tercero;*/

		//Articulo[] res = new Articulo[] {primero,segundo,tercero};//vector con datos cargados

		//return res;

		return new Articulo[] {primero,segundo,tercero};
	}

}
