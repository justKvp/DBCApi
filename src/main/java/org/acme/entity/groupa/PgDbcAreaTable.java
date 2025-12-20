package org.acme.entity.groupa;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_areatable", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcAreaTable extends PanacheEntityBase {

    @Id
    @Column(name = "id", nullable = false)
    public Integer id;

    @Column(name = "continent_id", nullable = false)
    public Integer continentId;

    @Column(name = "parent_area_id", nullable = false)
    public Integer parentAreaId;

    @Column(name = "area_bit", nullable = false)
    public Integer areaBit;

    @Column(name = "flags", nullable = false)
    public Integer flags;

    @Column(name = "sound_provider_pref", nullable = false)
    public Integer soundProviderPref;

    @Column(name = "sound_provider_pref_underwater", nullable = false)
    public Integer soundProviderPrefUnderwater;

    @Column(name = "ambience_id", nullable = false)
    public Integer ambienceId;

    @Column(name = "zone_music", nullable = false)
    public Integer zoneMusic;

    @Column(name = "intro_sound", nullable = false)
    public Integer introSound;

    @Column(name = "exploration_level", nullable = false)
    public Integer explorationLevel;

    @Column(name = "area_name_lang_enus")
    public String areaNameLangEnus;

    @Column(name = "area_name_lang_engb")
    public String areaNameLangEngb;

    @Column(name = "area_name_lang_kokr")
    public String areaNameLangKokr;

    @Column(name = "area_name_lang_frfr")
    public String areaNameLangFrfr;

    @Column(name = "area_name_lang_dede")
    public String areaNameLangDede;

    @Column(name = "area_name_lang_encn")
    public String areaNameLangEncn;

    @Column(name = "area_name_lang_zhcn")
    public String areaNameLangZhcn;

    @Column(name = "area_name_lang_entw")
    public String areaNameLangEntw;

    @Column(name = "area_name_lang_zhtw")
    public String areaNameLangZhtw;

    @Column(name = "area_name_lang_eses")
    public String areaNameLangEses;

    @Column(name = "area_name_lang_esmx")
    public String areaNameLangEsmx;

    @Column(name = "area_name_lang_ruru")
    public String areaNameLangRuru;

    @Column(name = "area_name_lang_ptpt")
    public String areaNameLangPtpt;

    @Column(name = "area_name_lang_ptbr")
    public String areaNameLangPtbr;

    @Column(name = "area_name_lang_itit")
    public String areaNameLangItit;

    @Column(name = "area_name_lang_unk")
    public String areaNameLangUnk;

    @Column(name = "area_name_lang_mask", nullable = false)
    public Integer areaNameLangMask;

    @Column(name = "faction_group_mask", nullable = false)
    public Integer factionGroupMask;

    @Column(name = "liquid_type_id_1", nullable = false)
    public Integer liquidTypeId1;

    @Column(name = "liquid_type_id_2", nullable = false)
    public Integer liquidTypeId2;

    @Column(name = "liquid_type_id_3", nullable = false)
    public Integer liquidTypeId3;

    @Column(name = "liquid_type_id_4", nullable = false)
    public Integer liquidTypeId4;

    @Column(name = "min_elevation", nullable = false)
    public Float minElevation;

    @Column(name = "ambient_multiplier", nullable = false)
    public Float ambientMultiplier;

    @Column(name = "lightid", nullable = false)
    public Integer lightId;
}
