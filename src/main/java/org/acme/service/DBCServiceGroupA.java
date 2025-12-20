package org.acme.service;

import io.quarkus.cache.CacheResult;
import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.groupa.*;
import org.acme.util.RUtil;

@ApplicationScoped
public class DBCServiceGroupA {

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

    /**
     * dbc_areagroup
     **/
    @CacheResult(cacheName = "areagroup-cache")
    @WithSession
    public Uni<Response> handleGETAreaGroup(Integer id) {
        return PgDbcAreaGroup.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }

    /**
     * dbc_areatable
     **/
    @CacheResult(cacheName = "areatable-cache")
    @WithSession
    public Uni<Response> handleGETAreaTable(Integer id) {
        return PgDbcAreaTable.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }

    /**
     * dbc_areatrigger
     **/
    @CacheResult(cacheName = "areatrigger-cache")
    @WithSession
    public Uni<Response> handleGETAreaTrigger(Integer id) {
        return PgDbcAreaTrigger.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }

    /**
     * dbc_auctionhouse
     **/
    @CacheResult(cacheName = "auctionhouse-cache")
    @WithSession
    public Uni<Response> handleGETAuctionHouse(Integer id) {
        return PgDbcAuctionHouse.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }
}
