package org.acme.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_achievement", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcAchievement extends PanacheEntityBase {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "faction", nullable = false)
    private Integer faction;

    @Column(name = "instance_id", nullable = false)
    private Integer instanceId;

    @Column(name = "supercedes", nullable = false)
    private Integer supercedes;

    /* ===================== TITLE ===================== */

    @Column(name = "title_lang_enus", columnDefinition = "text")
    private String titleLangEnus;

    @Column(name = "title_lang_engb", columnDefinition = "text")
    private String titleLangEngb;

    @Column(name = "title_lang_kokr", columnDefinition = "text")
    private String titleLangKokr;

    @Column(name = "title_lang_frfr", columnDefinition = "text")
    private String titleLangFrfr;

    @Column(name = "title_lang_dede", columnDefinition = "text")
    private String titleLangDede;

    @Column(name = "title_lang_encn", columnDefinition = "text")
    private String titleLangEncn;

    @Column(name = "title_lang_zhcn", columnDefinition = "text")
    private String titleLangZhcn;

    @Column(name = "title_lang_entw", columnDefinition = "text")
    private String titleLangEntw;

    @Column(name = "title_lang_zhtw", columnDefinition = "text")
    private String titleLangZhtw;

    @Column(name = "title_lang_eses", columnDefinition = "text")
    private String titleLangEses;

    @Column(name = "title_lang_esmx", columnDefinition = "text")
    private String titleLangEsmx;

    @Column(name = "title_lang_ruru", columnDefinition = "text")
    private String titleLangRuru;

    @Column(name = "title_lang_ptpt", columnDefinition = "text")
    private String titleLangPtpt;

    @Column(name = "title_lang_ptbr", columnDefinition = "text")
    private String titleLangPtbr;

    @Column(name = "title_lang_itit", columnDefinition = "text")
    private String titleLangItit;

    @Column(name = "title_lang_unk", columnDefinition = "text")
    private String titleLangUnk;

    @Column(name = "title_lang_mask", nullable = false)
    private Long titleLangMask;

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
    private Long descriptionLangMask;

    /* ===================== META ===================== */

    @Column(name = "category", nullable = false)
    private Integer category;

    @Column(name = "points", nullable = false)
    private Integer points;

    @Column(name = "ui_order", nullable = false)
    private Integer uiOrder;

    @Column(name = "flags", nullable = false)
    private Integer flags;

    @Column(name = "iconid", nullable = false)
    private Integer iconId;

    /* ===================== REWARD ===================== */

    @Column(name = "reward_lang_enus", columnDefinition = "text")
    private String rewardLangEnus;

    @Column(name = "reward_lang_engb", columnDefinition = "text")
    private String rewardLangEngb;

    @Column(name = "reward_lang_kokr", columnDefinition = "text")
    private String rewardLangKokr;

    @Column(name = "reward_lang_frfr", columnDefinition = "text")
    private String rewardLangFrfr;

    @Column(name = "reward_lang_dede", columnDefinition = "text")
    private String rewardLangDede;

    @Column(name = "reward_lang_encn", columnDefinition = "text")
    private String rewardLangEncn;

    @Column(name = "reward_lang_zhcn", columnDefinition = "text")
    private String rewardLangZhcn;

    @Column(name = "reward_lang_entw", columnDefinition = "text")
    private String rewardLangEntw;

    @Column(name = "reward_lang_zhtw", columnDefinition = "text")
    private String rewardLangZhtw;

    @Column(name = "reward_lang_eses", columnDefinition = "text")
    private String rewardLangEses;

    @Column(name = "reward_lang_esmx", columnDefinition = "text")
    private String rewardLangEsmx;

    @Column(name = "reward_lang_ruru", columnDefinition = "text")
    private String rewardLangRuru;

    @Column(name = "reward_lang_ptpt", columnDefinition = "text")
    private String rewardLangPtpt;

    @Column(name = "reward_lang_ptbr", columnDefinition = "text")
    private String rewardLangPtbr;

    @Column(name = "reward_lang_itit", columnDefinition = "text")
    private String rewardLangItit;

    @Column(name = "reward_lang_unk", columnDefinition = "text")
    private String rewardLangUnk;

    @Column(name = "reward_lang_mask", nullable = false)
    private Long rewardLangMask;

    /* ===================== CRITERIA ===================== */

    @Column(name = "minimum_criteria", nullable = false)
    private Integer minimumCriteria;

    @Column(name = "shares_criteria", nullable = false)
    private Integer sharesCriteria;
}
