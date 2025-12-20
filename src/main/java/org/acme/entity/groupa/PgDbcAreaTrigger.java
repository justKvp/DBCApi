package org.acme.entity.groupa;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_areatrigger", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcAreaTrigger extends PanacheEntityBase {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id; // int4 DEFAULT 0 NOT NULL

    @Column(name = "continent_id", nullable = false)
    private Integer continentId; // int4 DEFAULT 0 NOT NULL

    @Column(name = "x", nullable = false)
    private Float x; // float4 DEFAULT 0 NOT NULL

    @Column(name = "y", nullable = false)
    private Float y; // float4 DEFAULT 0 NOT NULL

    @Column(name = "z", nullable = false)
    private Float z; // float4 DEFAULT 0 NOT NULL

    @Column(name = "radius", nullable = false)
    private Float radius; // float4 DEFAULT 0 NOT NULL

    @Column(name = "box_length", nullable = false)
    private Float boxLength; // float4 DEFAULT 0 NOT NULL

    @Column(name = "box_width", nullable = false)
    private Float boxWidth; // float4 DEFAULT 0 NOT NULL

    @Column(name = "box_height", nullable = false)
    private Float boxHeight; // float4 DEFAULT 0 NOT NULL

    @Column(name = "box_yaw", nullable = false)
    private Float boxYaw; // float4 DEFAULT 0 NOT NULL
}
