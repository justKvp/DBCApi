package org.acme.util;

import jakarta.ws.rs.core.Response;
import org.acme.pojo.CommonError;

import java.util.UUID;

public class RUtil {
    public static Response notFoundedId(Integer id) {
        CommonError error = new CommonError();
        error.setQueryId(UUID.randomUUID().toString());
        error.setError(String.format("Запись с id [%d] отсутствует", id));
        return Response.status(Response.Status.NOT_FOUND)
                .entity(error)
                .build();
    }
}
