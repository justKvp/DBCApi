package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.PgDbcVehicle;
import org.acme.pojo.CommonError;

import java.util.UUID;

@ApplicationScoped
public class DBCService {

    public Response handleGETVehicle(Integer id) {
        PgDbcVehicle vehicle = PgDbcVehicle.findById(id);
        if (vehicle == null) {
            CommonError error = new CommonError();
            error.setQueryId(UUID.randomUUID().toString());
            error.setError(String.format("Запись с id [%d] отсутствует", id));
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(error)
                    .build();
        }
        return Response.ok(vehicle).build();
    }
}
