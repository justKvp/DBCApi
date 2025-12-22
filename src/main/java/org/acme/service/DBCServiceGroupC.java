package org.acme.service;

import io.quarkus.cache.CacheResult;
import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.acme.entity.groupc.PgDbcCharacterFacialHairStyles;
import org.acme.util.RUtil;

@ApplicationScoped
public class DBCServiceGroupC {
    /**
     * dbc_characterfacialhairstyles
     **/
    @CacheResult(cacheName = "characterfacialhairstyles-cache")
    @WithSession
    public Uni<Response> handleGETCharacterFacialHairStyles(Integer id) {
        return PgDbcCharacterFacialHairStyles.findById(id)
                .onItem().transform(entry -> {
                    if (entry == null) {
                        return RUtil.notFoundedId(id);
                    }
                    return Response.ok(entry).build();
                });
    }
}
