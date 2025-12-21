package org.acme.service;

import io.quarkus.cache.CacheResult;
import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.groupb.PgDbcBankBagSlotPrices;
import org.acme.entity.groupb.PgDbcBannedAddons;
import org.acme.entity.groupb.PgDbcBarbershopStyle;
import org.acme.entity.groupb.PgDbcBattlemasterList;
import org.acme.util.RUtil;

@ApplicationScoped
public class DBCServiceGroupB {
    /**
     * dbc_bankbagslotprices
     **/
    @CacheResult(cacheName = "bankbagslotprices-cache")
    @WithSession
    public Uni<Response> handleGETBankBagSlotPrices(Integer id) {
        return PgDbcBankBagSlotPrices.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }

    /**
     * dbc_bannedaddons
     **/
    @CacheResult(cacheName = "bannedaddons-cache")
    @WithSession
    public Uni<Response> handleGETBannedAddons(Integer id) {
        return PgDbcBannedAddons.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }

    /**
     * dbc_barbershopstyle
     **/
    @CacheResult(cacheName = "barbershopstyle-cache")
    @WithSession
    public Uni<Response> handleGETBarbershopStyle(Integer id) {
        return PgDbcBarbershopStyle.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }

    /**
     * dbc_battlemasterlist
     **/
    @CacheResult(cacheName = "battlemasterlist-cache")
    @WithSession
    public Uni<Response> handleGETBattlemasterList(Integer id) {
        return PgDbcBattlemasterList.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }
}
