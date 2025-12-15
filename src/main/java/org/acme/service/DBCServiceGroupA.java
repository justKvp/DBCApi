package org.acme.service;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.PgDbcAchievement;
import org.acme.util.RUtil;

@ApplicationScoped
public class DBCServiceGroupA {
    @WithSession
    public Uni<Response> handleGETAchievement(Integer id) {
        // findById теперь возвращает Uni<PgDbcAchievement>
        return PgDbcAchievement.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }
}
