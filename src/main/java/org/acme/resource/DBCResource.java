package org.acme.resource;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.service.DBCServiceGroupA;
import org.acme.service.DBCServiceGroupV;

@Path("/dbc")
public class DBCResource {
    @Inject
    DBCServiceGroupA dbcServiceGroupA;
    @Inject
    DBCServiceGroupV dbcServiceGroupV;

    @GET
    @Path("/getAchievement/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getAchievement(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupA.handleGETAchievement(id);
    }

    @GET
    @Path("/getAchievementCriteria/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getAchievementCriteria(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupA.handleGETAchievementCriteria(id);
    }

    @GET
    @Path("/getVehicle/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getVehicle(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupV.handleGETVehicle(id);
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}
