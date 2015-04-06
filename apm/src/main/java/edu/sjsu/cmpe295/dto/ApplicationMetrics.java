package edu.sjsu.cmpe295.dto;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ApplicationMetrics {
	
	public void getApplicationIDs()
	{
		try {
			 
			Client client = Client.create();
	 
			WebResource webResource = client
			   .resource("https://api.newrelic.com/v2/applications.json");
			
	 
			ClientResponse response = webResource.accept("application/json")
					.header("X-Api-Key", "f09a3be01866a3be3c78e13f1cd5d172c1cb465a78c4b2e")
	                   .get(ClientResponse.class)
	                   ;
	 
			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}
	 
			String output = response.getEntity(String.class);
	 
			System.out.println("Output from Server .... \n");
			System.out.println(output);
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
	 
		  }
	}

	public static void main(String[] args)
	{
		ApplicationMetrics am = new ApplicationMetrics();
		am.getApplicationIDs();
	}
}
