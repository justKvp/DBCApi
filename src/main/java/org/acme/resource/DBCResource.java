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
import org.acme.service.DBCServiceGroupB;
import org.acme.service.DBCServiceGroupC;
import org.acme.service.DBCServiceGroupV;

@Path("/dbc")
public class DBCResource {
    @Inject
    DBCServiceGroupA dbcServiceGroupA;
    @Inject
    DBCServiceGroupB dbcServiceGroupB;
    @Inject
    DBCServiceGroupC dbcServiceGroupC;
    @Inject
    DBCServiceGroupV dbcServiceGroupV;

    /**
     * Group A
     **/
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
    @Path("/getAreaGroup/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getAreaGroup(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupA.handleGETAreaGroup(id);
    }

    @GET
    @Path("/getAreaTable/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getAreaTable(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupA.handleGETAreaTable(id);
    }

    @GET
    @Path("/getAreaTrigger/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getAreaTrigger(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupA.handleGETAreaTrigger(id);
    }

    @GET
    @Path("/getAuctionHouse/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getAuctionHouse(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupA.handleGETAuctionHouse(id);
    }

    /**
     * Group B
     **/
    @GET
    @Path("/getBankBagSlotPrices/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getBankBagSlotPrices(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupB.handleGETBankBagSlotPrices(id);
    }

    @GET
    @Path("/getBannedAddons/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getBannedAddons(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupB.handleGETBannedAddons(id);
    }

    @GET
    @Path("/getBarbershopStyle/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getBarbershopStyle(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupB.handleGETBarbershopStyle(id);
    }

    @GET
    @Path("/getBattlemasterList/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getBattlemasterList(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupB.handleGETBattlemasterList(id);
    }

    /**
     * Group C
     **/
    @GET
    @Path("/getCharacterFacialHairStyles/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getCharacterFacialHairStyles(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupC.handleGETCharacterFacialHairStyles(id);
    }

    /**
     * Group V
     **/
    @GET
    @Path("/getVehicle/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getVehicle(@PathParam(value = "id") Integer id) {
        return dbcServiceGroupV.handleGETVehicle(id);
    }
}
