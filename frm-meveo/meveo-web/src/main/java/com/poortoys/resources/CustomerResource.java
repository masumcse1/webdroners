package com.poortoys.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.poortoys.dtos.CustomerDTO;

/**
 * Created by Md. Zohir Raihan on 12/7/2023.
 *
 * Interface that used only for naming convention for methods for services
 */

@Path("/v1/customers")
public class CustomerResource {
	
	@POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response create(CustomerDTO customerDTO) {
    	    	    	
        return Response.status(200).entity(customerDTO).build();
    }

}
