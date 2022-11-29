package ar.com.codoAcodo.rest;

import ar.com.codoAcodo.web.jerseyClient.Users;
import jakarta.ws.rs.client.Client;

import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class MainRestUsers {

	public static void main(String[] args) {
		
		
		Client client = ClientBuilder.newClient();
		
		//https://reqres.in/api/users?page=2
		WebTarget webTarget = client.target("https://reqres.in")
				.path("/api/users")// los parametros que vand despues de a url
				.queryParam("page=2");//los parametros que van luego de ?cñave=valor&clave2=valor...
		
		//Invocation
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//metodo get
		Response response = invocation.get();
		
		//read de respuesta
		Users users = response.readEntity(Users.class);
		
		System.out.println(response);
		System.out.println(users);
		
	}
	
	

}
