package org.acme.entity.groupa;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_auctionhouse", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcAuctionHouse extends PanacheEntityBase {

    @Id
    @Column(name = "id", columnDefinition = "serial4 NOT NULL")
    private Integer id;

    @Column(name = "faction_id", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer factionId;

    @Column(name = "deposit_rate", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer depositRate;

    @Column(name = "consignment_rate", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer consignmentRate;

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

    @Column(name = "name_lang_mask", columnDefinition = "int4 DEFAULT 0 NOT NULL")
    private Integer nameLangMask;
}
