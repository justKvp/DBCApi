package org.acme.service;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.groupv.PgDbcVehicle;
import org.acme.util.RUtil;

@ApplicationScoped
public class DBCServiceGroupV {

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
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(vehicle).build();
                });
    }
}
