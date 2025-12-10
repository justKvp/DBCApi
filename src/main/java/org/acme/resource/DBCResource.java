package org.acme.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.service.DBCService;

@Path("/dbc")
public class DBCResource {
    @Inject
    DBCService dbcService;

    @GET
    @Path("/getVehicle/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVehicle(@PathParam(value = "id") Integer id) {
        return dbcService.handleGETVehicle(id);
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}
