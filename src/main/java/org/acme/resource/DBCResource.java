package org.acme.resource;

import io.smallrye.mutiny.Uni;
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
    public Uni<Response> getVehicle(@PathParam(value = "id") Integer id) {
        // Возвращаем Uni<Response> вместо Response
        return dbcService.handleGETVehicle(id);
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}
