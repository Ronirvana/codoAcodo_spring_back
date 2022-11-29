package ar.com.codoAcodo.rest;

import ar.com.codoAcodo.web.jerseyClient.User;
import jakarta.ws.rs.client.Client;

import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class MainRest {

	public static void main(String[] args) {
		
		/*
		 * {
    "data": {
        "id": 2,
        "email": "janet.weaver@reqres.in",
        "first_name": "Janet",
        "last_name": "Weaver",
        "avatar": "https://reqres.in/img/faces/2-image.jpg"
    },
    "support": {
        "url": "https://reqres.in/api/users/2"
    }
}
		 * */
		
		Client client = ClientBuilder.newClient();
		
		//https://reqres.in/api/users/2
		WebTarget webTarget = client.target("https://reqres.in").path("/api/users/2");
		
		//Invocation
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//metodo get
		Response response = invocation.get();
		
		//read de respuesta
		User user = response.readEntity(User.class);
		
		System.out.println(response);
		System.out.println(user);
		
	}
	
	

}
