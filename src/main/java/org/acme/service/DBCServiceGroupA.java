package org.acme.service;

import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.PgDbcAchievement;
import org.acme.entity.PgDbcAchievementCriteria;
import org.acme.util.RUtil;

@ApplicationScoped
public class DBCServiceGroupA {

    /**
     * dbc_achievement
     **/
    @WithSession
    public Uni<Response> handleGETAchievement(Integer id) {
        return PgDbcAchievement.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }

    /**
     * dbc_achievement_criteria
     **/
    @WithSession
    public Uni<Response> handleGETAchievementCriteria(Integer id) {
        return PgDbcAchievementCriteria.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }
}
