package org.acme.entity.groupb;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_bannedaddons", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcBannedAddons extends PanacheEntityBase {

    @Id
    @Column(
            name = "id",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer id;

    @Column(
            name = "namemd5_1",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long nameMd5_1;

    @Column(
            name = "namemd5_2",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long nameMd5_2;

    @Column(
            name = "namemd5_3",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long nameMd5_3;

    @Column(
            name = "namemd5_4",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long nameMd5_4;

    @Column(
            name = "versionmd5_1",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long versionMd5_1;

    @Column(
            name = "versionmd5_2",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long versionMd5_2;

    @Column(
            name = "versionmd5_3",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long versionMd5_3;

    @Column(
            name = "versionmd5_4",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long versionMd5_4;

    @Column(
            name = "lastmodified",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer lastModified;

    @Column(
            name = "flags",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer flags;
}
