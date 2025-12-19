package org.acme.service;

import io.quarkus.cache.CacheResult;
import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.PgDbcAchievement;
import org.acme.entity.PgDbcAchievementCriteria;
import org.acme.util.RUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class DBCServiceGroupA {
    public static final Logger logger = LoggerFactory.getLogger("DBCServiceGroupA");

    /**
     * dbc_achievement
     **/
    @CacheResult(cacheName = "achievement-cache")
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
    @CacheResult(cacheName = "achievement_criteria-cache")
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
