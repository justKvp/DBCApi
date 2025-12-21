package org.acme.entity.groupb;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_battlemasterlist", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcBattlemasterList extends PanacheEntityBase {

    @Id
    @Column(
            name = "id",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer id;

    @Column(name = "mapid_1", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId1;

    @Column(name = "mapid_2", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId2;

    @Column(name = "mapid_3", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId3;

    @Column(name = "mapid_4", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId4;

    @Column(name = "mapid_5", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId5;

    @Column(name = "mapid_6", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId6;

    @Column(name = "mapid_7", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId7;

    @Column(name = "mapid_8", nullable = false, columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer mapId8;

    @Column(
            name = "instance_type",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer instanceType;

    @Column(
            name = "groups_allowed",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer groupsAllowed;

    // -------- name --------

    @Column(name = "name_lang_enus", columnDefinition = "text")
    private String nameLangEnus;

    @Column(name = "name_lang_engb", columnDefinition = "text")
    private String nameLangEngb;

    @Column(name = "name_lang_kokr", columnDefinition = "text")
    private String nameLangKokr;

    @Column(name = "name_lang_frfr", columnDefinition = "text")
    private String nameLangFrfr;

    @Column(name = "name_lang_dede", columnDefinition = "text")
    private String nameLangDede;

    @Column(name = "name_lang_encn", columnDefinition = "text")
    private String nameLangEncn;

    @Column(name = "name_lang_zhcn", columnDefinition = "text")
    private String nameLangZhcn;

    @Column(name = "name_lang_entw", columnDefinition = "text")
    private String nameLangEntw;

    @Column(name = "name_lang_zhtw", columnDefinition = "text")
    private String nameLangZhtw;

    @Column(name = "name_lang_eses", columnDefinition = "text")
    private String nameLangEses;

    @Column(name = "name_lang_esmx", columnDefinition = "text")
    private String nameLangEsmx;

    @Column(name = "name_lang_ruru", columnDefinition = "text")
    private String nameLangRuru;

    @Column(name = "name_lang_ptpt", columnDefinition = "text")
    private String nameLangPtpt;

    @Column(name = "name_lang_ptbr", columnDefinition = "text")
    private String nameLangPtbr;

    @Column(name = "name_lang_itit", columnDefinition = "text")
    private String nameLangItit;

    @Column(name = "name_lang_unk", columnDefinition = "text")
    private String nameLangUnk;

    @Column(
            name = "name_lang_mask",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long nameLangMask;

    // -------- misc --------

    @Column(
            name = "max_group_size",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer maxGroupSize;

    @Column(
            name = "holiday_worldstate",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer holidayWorldstate;

    @Column(
            name = "minlevel",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer minLevel;

    @Column(
            name = "maxlevel",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer maxLevel;
}
