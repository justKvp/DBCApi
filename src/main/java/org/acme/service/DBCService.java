package org.acme.service;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.PgDbcVehicle;
import org.acme.pojo.CommonError;

import java.util.UUID;

@ApplicationScoped
public class DBCService {

    /**
     * @WithTransaction: Открывает транзакцию и сессию. Подходит для операций, которые могут включать несколько запросов к БД.
     * @WithSession: Открывает только сессию без транзакции. Подходит для операций только на чтение.
     */

    @WithSession
    public Uni<Response> handleGETVehicle(Integer id) {
        // findById теперь возвращает Uni<PgDbcVehicle>
        return PgDbcVehicle.findById(id)
                .onItem().transform(vehicle -> {
                    if (vehicle == null) {
                        CommonError error = new CommonError();
                        error.setQueryId(UUID.randomUUID().toString());
                        error.setError(String.format("Запись с id [%d] отсутствует", id));
                        return Response.status(Response.Status.NOT_FOUND)
                                .entity(error)
                                .build();
                    }
                    return Response.ok(vehicle).build();
                });
    }
}
