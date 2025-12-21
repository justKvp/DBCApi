package org.acme.entity.groupb;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_barbershopstyle", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcBarbershopStyle extends PanacheEntityBase {

    @Id
    @Column(
            name = "id",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer id;

    @Column(
            name = "type",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer type;

    // -------- displayname --------

    @Column(name = "displayname_lang_enus", columnDefinition = "text")
    private String displaynameLangEnus;

    @Column(name = "displayname_lang_engb", columnDefinition = "text")
    private String displaynameLangEngb;

    @Column(name = "displayname_lang_kokr", columnDefinition = "text")
    private String displaynameLangKokr;

    @Column(name = "displayname_lang_frfr", columnDefinition = "text")
    private String displaynameLangFrfr;

    @Column(name = "displayname_lang_dede", columnDefinition = "text")
    private String displaynameLangDede;

    @Column(name = "displayname_lang_encn", columnDefinition = "text")
    private String displaynameLangEncn;

    @Column(name = "displayname_lang_zhcn", columnDefinition = "text")
    private String displaynameLangZhcn;

    @Column(name = "displayname_lang_entw", columnDefinition = "text")
    private String displaynameLangEntw;

    @Column(name = "displayname_lang_zhtw", columnDefinition = "text")
    private String displaynameLangZhtw;

    @Column(name = "displayname_lang_eses", columnDefinition = "text")
    private String displaynameLangEses;

    @Column(name = "displayname_lang_esmx", columnDefinition = "text")
    private String displaynameLangEsmx;

    @Column(name = "displayname_lang_ruru", columnDefinition = "text")
    private String displaynameLangRuru;

    @Column(name = "displayname_lang_ptpt", columnDefinition = "text")
    private String displaynameLangPtpt;

    @Column(name = "displayname_lang_ptbr", columnDefinition = "text")
    private String displaynameLangPtbr;

    @Column(name = "displayname_lang_itit", columnDefinition = "text")
    private String displaynameLangItit;

    @Column(name = "displayname_lang_unk", columnDefinition = "text")
    private String displaynameLangUnk;

    @Column(
            name = "displayname_lang_mask",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long displaynameLangMask;

    // -------- description --------

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

    @Column(
            name = "description_lang_mask",
            nullable = false,
            columnDefinition = "int8 DEFAULT 0 NOT NULL"
    )
    private Long descriptionLangMask;

    // -------- misc --------

    @Column(
            name = "cost_modifier",
            nullable = false,
            columnDefinition = "float4 DEFAULT 0 NOT NULL"
    )
    private Float costModifier;

    @Column(
            name = "race",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer race;

    @Column(
            name = "sex",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer sex;

    @Column(
            name = "data",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0 NOT NULL"
    )
    private Integer data;
}
