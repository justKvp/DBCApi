package org.acme.entity.groupa;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_areatable", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcAreaTable extends PanacheEntityBase {

    @Id
    @Column(name = "id", columnDefinition = "serial4 NOT NULL")
    private Integer id;

    @Column(name = "continent_id", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer continentId;

    @Column(name = "parent_area_id", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer parentAreaId;

    @Column(name = "area_bit", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer areaBit;

    @Column(name = "flags", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer flags;

    @Column(name = "sound_provider_pref", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer soundProviderPref;

    @Column(name = "sound_provider_pref_underwater", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer soundProviderPrefUnderwater;

    @Column(name = "ambience_id", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer ambienceId;

    @Column(name = "zone_music", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer zoneMusic;

    @Column(name = "intro_sound", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer introSound;

    @Column(name = "exploration_level", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer explorationLevel;

    @Column(name = "area_name_lang_enus", columnDefinition = "text")
    private String areaNameLangEnus;

    @Column(name = "area_name_lang_engb", columnDefinition = "text")
    private String areaNameLangEngb;

    @Column(name = "area_name_lang_kokr", columnDefinition = "text")
    private String areaNameLangKokr;

    @Column(name = "area_name_lang_frfr", columnDefinition = "text")
    private String areaNameLangFrfr;

    @Column(name = "area_name_lang_dede", columnDefinition = "text")
    private String areaNameLangDede;

    @Column(name = "area_name_lang_encn", columnDefinition = "text")
    private String areaNameLangEncn;

    @Column(name = "area_name_lang_zhcn", columnDefinition = "text")
    private String areaNameLangZhcn;

    @Column(name = "area_name_lang_entw", columnDefinition = "text")
    private String areaNameLangEntw;

    @Column(name = "area_name_lang_zhtw", columnDefinition = "text")
    private String areaNameLangZhtw;

    @Column(name = "area_name_lang_eses", columnDefinition = "text")
    private String areaNameLangEses;

    @Column(name = "area_name_lang_esmx", columnDefinition = "text")
    private String areaNameLangEsmx;

    @Column(name = "area_name_lang_ruru", columnDefinition = "text")
    private String areaNameLangRuru;

    @Column(name = "area_name_lang_ptpt", columnDefinition = "text")
    private String areaNameLangPtpt;

    @Column(name = "area_name_lang_ptbr", columnDefinition = "text")
    private String areaNameLangPtbr;

    @Column(name = "area_name_lang_itit", columnDefinition = "text")
    private String areaNameLangItit;

    @Column(name = "area_name_lang_unk", columnDefinition = "text")
    private String areaNameLangUnk;

    @Column(name = "area_name_lang_mask", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer areaNameLangMask;

    @Column(name = "faction_group_mask", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer factionGroupMask;

    @Column(name = "liquid_type_id_1", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer liquidTypeId1;

    @Column(name = "liquid_type_id_2", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer liquidTypeId2;

    @Column(name = "liquid_type_id_3", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer liquidTypeId3;

    @Column(name = "liquid_type_id_4", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer liquidTypeId4;

    @Column(name = "min_elevation", columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float minElevation;

    @Column(name = "ambient_multiplier", columnDefinition = "float4 DEFAULT 0 NOT NULL")
    private Float ambientMultiplier;

    @Column(name = "lightid", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer lightId;
}
