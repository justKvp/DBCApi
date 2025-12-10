package org.acme.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.sql.Timestamp;
import java.time.Instant;

@RegisterForReflection
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonError {
    @JsonProperty("created_at")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",
            timezone = "UTC"
    )
    private Timestamp createdAt = Timestamp.from(Instant.now());

    @JsonProperty("query_id")
    private String queryId;

    @JsonProperty("error")
    private String error;
}
