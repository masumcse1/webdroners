package com.poortoys.resources;

import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.poortoys.dtos.CustomerDTO;
import com.poortoys.exceptions.ApplicationException;

/**
 * Created by Md. Zohir Raihan on 12/7/2023.
 *
 * Interface that used only for naming convention for methods for services
 */

@Path("/v1/customers")
@RequestScoped
public class CustomerResource {
	
	@Path("/create")
	@POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)	
    public Response create(@Valid CustomerDTO customerDTO) {
    	    	    	
        return Response.status(200).entity(customerDTO).build();
    }
	
	@GET
    //@Path("{cusomerId}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response find(@QueryParam("cusomerId") Long cusomerId) {
		
		if((Long) cusomerId == null) {
			throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity("cusomerId parameter value is mandatory").build());
			//throw new NotFoundException("cusomerId not found in URL path");
			//throw new ApplicationException(Response.Status.NOT_FOUND);
			//return Response.status(400).entity("cusomerId missing in API URL").build();
		}
		
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerId(cusomerId);
		customerDTO.setCustomerName("Alice");
		
		return Response.status(200).entity(customerDTO).build();
    }

}
