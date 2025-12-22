package org.acme.entity.groupc;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_characterfacialhairstyles", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcCharacterFacialHairStyles extends PanacheEntityBase {

    @Id
    @Column(
            name = "id",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer id;

    @Column(
            name = "raceid",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer raceId;

    @Column(
            name = "sexid",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer sexId;

    @Column(
            name = "variationid",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer variationId;

    @Column(
            name = "geoset_1",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer geoset1;

    @Column(
            name = "geoset_2",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer geoset2;

    @Column(
            name = "geoset_3",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer geoset3;

    @Column(
            name = "geoset_4",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer geoset4;

    @Column(
            name = "geoset_5",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer geoset5;
}
