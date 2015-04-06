package edu.sjsu.cmpe295.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.sjsu.cmpe295.dto.ApplicationMetrics;
//import org.codehaus.jettison.json.JSONObject;

@Path("/ApplicationMetricsResource")
public class ApplicationMetricsResource {
	
	ApplicationMetrics am = new ApplicationMetrics();
	
	@GET
	@Produces( { MediaType.APPLICATION_JSON})
	public void getAllMetrics() {
	
		
	}
}
