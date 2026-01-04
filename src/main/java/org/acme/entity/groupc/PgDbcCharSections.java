package org.acme.entity.groupc;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_charsections", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcCharSections extends PanacheEntityBase {

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
            name = "basesection",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer baseSection;

    @Column(
            name = "texturename_1",
            columnDefinition = "text"
    )
    private String textureName1;

    @Column(
            name = "texturename_2",
            columnDefinition = "text"
    )
    private String textureName2;

    @Column(
            name = "texturename_3",
            columnDefinition = "text"
    )
    private String textureName3;

    @Column(
            name = "flags",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer flags;

    @Column(
            name = "variationindex",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer variationIndex;

    @Column(
            name = "colorindex",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer colorIndex;
}