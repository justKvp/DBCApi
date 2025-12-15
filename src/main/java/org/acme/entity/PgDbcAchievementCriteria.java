package org.acme.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_achievement_criteria", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcAchievementCriteria extends PanacheEntityBase {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "achievement_id", nullable = false)
    private Integer achievementId;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "asset_id", nullable = false)
    private Integer assetId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "start_event", nullable = false)
    private Integer startEvent;

    @Column(name = "start_asset", nullable = false)
    private Integer startAsset;

    @Column(name = "fail_event", nullable = false)
    private Integer failEvent;

    @Column(name = "fail_asset", nullable = false)
    private Integer failAsset;

    /* ===================== DESCRIPTION ===================== */

    @Column(name = "description_lang_enus", columnDefinition = "text")
    private String descriptionLangEnus;

    @Column(name = "description_lang_engb", columnDefinition = "text")
    private String descriptionLangEngb;

    @Column(name = "description_lang_kokr", columnDefinition = "text")
    private String descriptionLangKokr;

    @Column(name = "description_lang_frfr", columnDefinition = "text")
    private String descriptionLangFrfr;

    @Column(name = "description_lang_dede", columnDefinition = "text")
    private String descriptionLangDede;

    @Column(name = "description_lang_encn", columnDefinition = "text")
    private String descriptionLangEncn;

    @Column(name = "description_lang_zhcn", columnDefinition = "text")
    private String descriptionLangZhcn;

    @Column(name = "description_lang_entw", columnDefinition = "text")
    private String descriptionLangEntw;

    @Column(name = "description_lang_zhtw", columnDefinition = "text")
    private String descriptionLangZhtw;

    @Column(name = "description_lang_eses", columnDefinition = "text")
    private String descriptionLangEses;

    @Column(name = "description_lang_esmx", columnDefinition = "text")
    private String descriptionLangEsmx;

    @Column(name = "description_lang_ruru", columnDefinition = "text")
    private String descriptionLangRuru;

    @Column(name = "description_lang_ptpt", columnDefinition = "text")
    private String descriptionLangPtpt;

    @Column(name = "description_lang_ptbr", columnDefinition = "text")
    private String descriptionLangPtbr;

    @Column(name = "description_lang_itit", columnDefinition = "text")
    private String descriptionLangItit;

    @Column(name = "description_lang_unk", columnDefinition = "text")
    private String descriptionLangUnk;

    @Column(name = "description_lang_mask", nullable = false)
    private Integer descriptionLangMask;

    /* ===================== META ===================== */

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "timer_start_event", nullable = false)
    private Integer timerStartEvent;

    @Column(name = "timer_asset_id", nullable = false)
    private Integer timerAssetId;

    @Column(name = "timer_time", nullable = false)
    private Integer timerTime;

    @Column(name = "ui_order", nullable = false)
    private Integer uiOrder;
}
