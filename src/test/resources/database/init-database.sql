CREATE SCHEMA dbc;

CREATE TABLE dbc.dbc_achievement
(
    id                    int4 DEFAULT 0 NOT NULL,
    faction               int4 DEFAULT 0 NOT NULL,
    instance_id           int4 DEFAULT 0 NOT NULL,
    supercedes            int4 DEFAULT 0 NOT NULL,
    title_lang_enus       text NULL,
    title_lang_engb       text NULL,
    title_lang_kokr       text NULL,
    title_lang_frfr       text NULL,
    title_lang_dede       text NULL,
    title_lang_encn       text NULL,
    title_lang_zhcn       text NULL,
    title_lang_entw       text NULL,
    title_lang_zhtw       text NULL,
    title_lang_eses       text NULL,
    title_lang_esmx       text NULL,
    title_lang_ruru       text NULL,
    title_lang_ptpt       text NULL,
    title_lang_ptbr       text NULL,
    title_lang_itit       text NULL,
    title_lang_unk        text NULL,
    title_lang_mask       int8 DEFAULT 0 NOT NULL,
    description_lang_enus text NULL,
    description_lang_engb text NULL,
    description_lang_kokr text NULL,
    description_lang_frfr text NULL,
    description_lang_dede text NULL,
    description_lang_encn text NULL,
    description_lang_zhcn text NULL,
    description_lang_entw text NULL,
    description_lang_zhtw text NULL,
    description_lang_eses text NULL,
    description_lang_esmx text NULL,
    description_lang_ruru text NULL,
    description_lang_ptpt text NULL,
    description_lang_ptbr text NULL,
    description_lang_itit text NULL,
    description_lang_unk  text NULL,
    description_lang_mask int8 DEFAULT 0 NOT NULL,
    category              int4 DEFAULT 0 NOT NULL,
    points                int4 DEFAULT 0 NOT NULL,
    ui_order              int4 DEFAULT 0 NOT NULL,
    flags                 int4 DEFAULT 0 NOT NULL,
    iconid                int4 DEFAULT 0 NOT NULL,
    reward_lang_enus      text NULL,
    reward_lang_engb      text NULL,
    reward_lang_kokr      text NULL,
    reward_lang_frfr      text NULL,
    reward_lang_dede      text NULL,
    reward_lang_encn      text NULL,
    reward_lang_zhcn      text NULL,
    reward_lang_entw      text NULL,
    reward_lang_zhtw      text NULL,
    reward_lang_eses      text NULL,
    reward_lang_esmx      text NULL,
    reward_lang_ruru      text NULL,
    reward_lang_ptpt      text NULL,
    reward_lang_ptbr      text NULL,
    reward_lang_itit      text NULL,
    reward_lang_unk       text NULL,
    reward_lang_mask      int8 DEFAULT 0 NOT NULL,
    minimum_criteria      int4 DEFAULT 0 NOT NULL,
    shares_criteria       int4 DEFAULT 0 NOT NULL,
    CONSTRAINT pk_dbc_achievement PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_achievement (id, faction, instance_id, supercedes, title_lang_enus, title_lang_engb,
                                 title_lang_kokr, title_lang_frfr, title_lang_dede, title_lang_encn, title_lang_zhcn,
                                 title_lang_entw, title_lang_zhtw, title_lang_eses, title_lang_esmx, title_lang_ruru,
                                 title_lang_ptpt, title_lang_ptbr, title_lang_itit, title_lang_unk, title_lang_mask,
                                 description_lang_enus, description_lang_engb, description_lang_kokr,
                                 description_lang_frfr, description_lang_dede, description_lang_encn,
                                 description_lang_zhcn, description_lang_entw, description_lang_zhtw,
                                 description_lang_eses, description_lang_esmx, description_lang_ruru,
                                 description_lang_ptpt, description_lang_ptbr, description_lang_itit,
                                 description_lang_unk, description_lang_mask, category, points, ui_order, flags, iconid,
                                 reward_lang_enus, reward_lang_engb, reward_lang_kokr, reward_lang_frfr,
                                 reward_lang_dede, reward_lang_encn, reward_lang_zhcn, reward_lang_entw,
                                 reward_lang_zhtw, reward_lang_eses, reward_lang_esmx, reward_lang_ruru,
                                 reward_lang_ptpt, reward_lang_ptbr, reward_lang_itit, reward_lang_unk,
                                 reward_lang_mask, minimum_criteria, shares_criteria)
VALUES (6, -1, -1, 0, 'Level 10', 'Level 10', '10 레벨', 'Niveau 10', 'Stufe 10', '10级', '10级', '10級', '10級',
        'Nivel 10', 'Nivel 10', '10-й уровень', '', '', '', '', 16712190, 'Reach level 10.', 'Reach level 10.',
        '10 레벨 달성', 'Atteindre le niveau 10.', 'Erreicht Stufe 10.', '升到10级。', '升到10级。', '達到10級。', '達到10級。',
        'Alcanza el nivel 10.', 'Alcanza el nivel 10.', 'Достигните 10-го уровня.', '', '', '', '', 16712190, 92, 10, 1,
        4, 3268, '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 16712174, 0, 0);

CREATE TABLE dbc.dbc_achievement_criteria
(
    id                    serial4        NOT NULL,
    achievement_id        int4 DEFAULT 0 NOT NULL,
    "type"                int4 DEFAULT 0 NOT NULL,
    asset_id              int4 DEFAULT 0 NOT NULL,
    quantity              int4 DEFAULT 0 NOT NULL,
    start_event           int4 DEFAULT 0 NOT NULL,
    start_asset           int4 DEFAULT 0 NOT NULL,
    fail_event            int4 DEFAULT 0 NOT NULL,
    fail_asset            int4 DEFAULT 0 NOT NULL,
    description_lang_enus text NULL,
    description_lang_engb text NULL,
    description_lang_kokr text NULL,
    description_lang_frfr text NULL,
    description_lang_dede text NULL,
    description_lang_encn text NULL,
    description_lang_zhcn text NULL,
    description_lang_entw text NULL,
    description_lang_zhtw text NULL,
    description_lang_eses text NULL,
    description_lang_esmx text NULL,
    description_lang_ruru text NULL,
    description_lang_ptpt text NULL,
    description_lang_ptbr text NULL,
    description_lang_itit text NULL,
    description_lang_unk  text NULL,
    description_lang_mask int4 DEFAULT 0 NOT NULL,
    flags                 int4 DEFAULT 0 NOT NULL,
    timer_start_event     int4 DEFAULT 0 NOT NULL,
    timer_asset_id        int4 DEFAULT 0 NOT NULL,
    timer_time            int4 DEFAULT 0 NOT NULL,
    ui_order              int4 DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_achievement_criteria_pkey PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_achievement_criteria (id, achievement_id, "type", asset_id, quantity, start_event, start_asset,
                                          fail_event, fail_asset, description_lang_enus, description_lang_engb,
                                          description_lang_kokr, description_lang_frfr, description_lang_dede,
                                          description_lang_encn, description_lang_zhcn, description_lang_entw,
                                          description_lang_zhtw, description_lang_eses, description_lang_esmx,
                                          description_lang_ruru, description_lang_ptpt, description_lang_ptbr,
                                          description_lang_itit, description_lang_unk, description_lang_mask, flags,
                                          timer_start_event, timer_asset_id, timer_time, ui_order)
VALUES (34, 6, 5, 0, 10, 0, 0, 0, 0, 'Reach level 10', 'Reach level 10', '10 레벨 달성', 'Atteindre le niveau 10',
        'Erreicht Stufe 10', '升到10级。', '升到10级。', '達到10級', '達到10級', 'Alcanza el nivel 10',
        'Alcanza el nivel 10', 'Достигните 10-го уровня', '', '', '', '', 16712190, 2, 0, 0, 0, 1);

CREATE TABLE dbc.dbc_areagroup
(
    id         int4 DEFAULT 0 NOT NULL,
    areaid_1   int4 DEFAULT 0 NOT NULL,
    areaid_2   int4 DEFAULT 0 NOT NULL,
    areaid_3   int4 DEFAULT 0 NOT NULL,
    areaid_4   int4 DEFAULT 0 NOT NULL,
    areaid_5   int4 DEFAULT 0 NOT NULL,
    areaid_6   int4 DEFAULT 0 NOT NULL,
    nextareaid int4 DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_areagroup_pkey PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_areagroup (id, areaid_1, areaid_2, areaid_3, areaid_4, areaid_5, areaid_6, nextareaid)
VALUES (34, 1977, 0, 0, 0, 0, 0, 0);

CREATE TABLE dbc.dbc_areatable
(
    id                             serial4          NOT NULL,
    continent_id                   int4   DEFAULT 0 NOT NULL,
    parent_area_id                 int4   DEFAULT 0 NOT NULL,
    area_bit                       int4   DEFAULT 0 NOT NULL,
    flags                          int4   DEFAULT 0 NOT NULL,
    sound_provider_pref            int4   DEFAULT 0 NOT NULL,
    sound_provider_pref_underwater int4   DEFAULT 0 NOT NULL,
    ambience_id                    int4   DEFAULT 0 NOT NULL,
    zone_music                     int4   DEFAULT 0 NOT NULL,
    intro_sound                    int4   DEFAULT 0 NOT NULL,
    exploration_level              int4   DEFAULT 0 NOT NULL,
    area_name_lang_enus            text NULL,
    area_name_lang_engb            text NULL,
    area_name_lang_kokr            text NULL,
    area_name_lang_frfr            text NULL,
    area_name_lang_dede            text NULL,
    area_name_lang_encn            text NULL,
    area_name_lang_zhcn            text NULL,
    area_name_lang_entw            text NULL,
    area_name_lang_zhtw            text NULL,
    area_name_lang_eses            text NULL,
    area_name_lang_esmx            text NULL,
    area_name_lang_ruru            text NULL,
    area_name_lang_ptpt            text NULL,
    area_name_lang_ptbr            text NULL,
    area_name_lang_itit            text NULL,
    area_name_lang_unk             text NULL,
    area_name_lang_mask            int4   DEFAULT 0 NOT NULL,
    faction_group_mask             int4   DEFAULT 0 NOT NULL,
    liquid_type_id_1               int4   DEFAULT 0 NOT NULL,
    liquid_type_id_2               int4   DEFAULT 0 NOT NULL,
    liquid_type_id_3               int4   DEFAULT 0 NOT NULL,
    liquid_type_id_4               int4   DEFAULT 0 NOT NULL,
    min_elevation                  float4 DEFAULT 0 NOT NULL,
    ambient_multiplier             float4 DEFAULT 0 NOT NULL,
    lightid                        int4   DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_areatable_pkey PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_areatable (id, continent_id, parent_area_id, area_bit, flags, sound_provider_pref,
                               sound_provider_pref_underwater, ambience_id, zone_music, intro_sound, exploration_level,
                               area_name_lang_enus, area_name_lang_engb, area_name_lang_kokr, area_name_lang_frfr,
                               area_name_lang_dede, area_name_lang_encn, area_name_lang_zhcn, area_name_lang_entw,
                               area_name_lang_zhtw, area_name_lang_eses, area_name_lang_esmx, area_name_lang_ruru,
                               area_name_lang_ptpt, area_name_lang_ptbr, area_name_lang_itit, area_name_lang_unk,
                               area_name_lang_mask, faction_group_mask, liquid_type_id_1, liquid_type_id_2,
                               liquid_type_id_3, liquid_type_id_4, min_elevation, ambient_multiplier, lightid)
VALUES (34, 0, 12, 141, 1073741824, 0, 11, 35, 1, 0, 0, 'Echo Ridge Mine', 'Echo Ridge Mine', '메아리 광산',
        'Mine de la crête aux échos', 'Echokammmine', '回音山矿洞', '回音山矿洞', '回音山礦坑', '回音山礦坑',
        'Mina del Eco', 'Mina del Eco', 'Рудник Горного Эха', '', '', '', '', 16712190, 0, 0, 0, 0, 0, -500.0, 0.0, 0);

CREATE TABLE dbc.dbc_areatrigger
(
    id           int4   DEFAULT 0 NOT NULL,
    continent_id int4   DEFAULT 0 NOT NULL,
    x            float4 DEFAULT 0 NOT NULL,
    y            float4 DEFAULT 0 NOT NULL,
    z            float4 DEFAULT 0 NOT NULL,
    radius       float4 DEFAULT 0 NOT NULL,
    box_length   float4 DEFAULT 0 NOT NULL,
    box_width    float4 DEFAULT 0 NOT NULL,
    box_height   float4 DEFAULT 0 NOT NULL,
    box_yaw      float4 DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_areatrigger_pkey PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_areatrigger (id, continent_id, x, y, z, radius, box_length, box_width, box_height, box_yaw)
VALUES (45, 0, 2924.38, -798.429, 161.611, 8.0, 0.0, 0.0, 0.0, 0.0);

CREATE TABLE dbc.dbc_auctionhouse
(
    id               serial4        NOT NULL,
    faction_id       int4 DEFAULT 0 NOT NULL,
    deposit_rate     int4 DEFAULT 0 NOT NULL,
    consignment_rate int4 DEFAULT 0 NOT NULL,
    name_lang_enus   text NULL,
    name_lang_engb   text NULL,
    name_lang_kokr   text NULL,
    name_lang_frfr   text NULL,
    name_lang_dede   text NULL,
    name_lang_encn   text NULL,
    name_lang_zhcn   text NULL,
    name_lang_entw   text NULL,
    name_lang_zhtw   text NULL,
    name_lang_eses   text NULL,
    name_lang_esmx   text NULL,
    name_lang_ruru   text NULL,
    name_lang_ptpt   text NULL,
    name_lang_ptbr   text NULL,
    name_lang_itit   text NULL,
    name_lang_unk    text NULL,
    name_lang_mask   int4 DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_auctionhouse_pkey PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_auctionhouse (id, faction_id, deposit_rate, consignment_rate, name_lang_enus, name_lang_engb,
                                  name_lang_kokr, name_lang_frfr, name_lang_dede, name_lang_encn, name_lang_zhcn,
                                  name_lang_entw, name_lang_zhtw, name_lang_eses, name_lang_esmx, name_lang_ruru,
                                  name_lang_ptpt, name_lang_ptbr, name_lang_itit, name_lang_unk, name_lang_mask)
VALUES (1, 1, 5, 5, 'Stormwind Auction House', 'Stormwind Auction House', '스톰윈드 경매장', 'Hôtel des ventes de Hurlevent',
        'Auktionshaus von Sturmwind', '暴风城拍卖行', '暴风城拍卖行', '暴風城拍賣場', '暴風城拍賣場',
        'Casa de subastas: Ventormenta', 'Casa de subastas: Ventormenta', 'Аукционный дом Штормграда', '', '', '', '',
        16712190);

CREATE TABLE dbc.dbc_bankbagslotprices
(
    id     int4 DEFAULT 0 NOT NULL,
    "cost" int4 DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_bankbagslotprices_pkey PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_bankbagslotprices (id, "cost")
VALUES (1, 1000);

CREATE TABLE dbc.dbc_bannedaddons
(
    id           int4 DEFAULT 0 NOT NULL,
    namemd5_1    int8 DEFAULT 0 NOT NULL,
    namemd5_2    int8 DEFAULT 0 NOT NULL,
    namemd5_3    int8 DEFAULT 0 NOT NULL,
    namemd5_4    int8 DEFAULT 0 NOT NULL,
    versionmd5_1 int8 DEFAULT 0 NOT NULL,
    versionmd5_2 int8 DEFAULT 0 NOT NULL,
    versionmd5_3 int8 DEFAULT 0 NOT NULL,
    versionmd5_4 int8 DEFAULT 0 NOT NULL,
    lastmodified int4 DEFAULT 0 NOT NULL,
    flags        int4 DEFAULT 0 NOT NULL,
    CONSTRAINT pk_dbc_bannedaddons PRIMARY KEY (id)
);

INSERT INTO dbc.dbc_bannedaddons (id, namemd5_1, namemd5_2, namemd5_3, namemd5_4, versionmd5_1, versionmd5_2,
                                  versionmd5_3, versionmd5_4, lastmodified, flags)
VALUES (1, 3649838548, 78774415, 2550759657, 2118318316, 3649838548, 78774415, 2550759657, 2118318316, 1228172248, 2);

CREATE TABLE dbc.dbc_barbershopstyle
(
    id                    int4   DEFAULT 0 NOT NULL,
    "type"                int4   DEFAULT 0 NOT NULL,
    displayname_lang_enus text NULL,
    displayname_lang_engb text NULL,
    displayname_lang_kokr text NULL,
    displayname_lang_frfr text NULL,
    displayname_lang_dede text NULL,
    displayname_lang_encn text NULL,
    displayname_lang_zhcn text NULL,
    displayname_lang_entw text NULL,
    displayname_lang_zhtw text NULL,
    displayname_lang_eses text NULL,
    displayname_lang_esmx text NULL,
    displayname_lang_ruru text NULL,
    displayname_lang_ptpt text NULL,
    displayname_lang_ptbr text NULL,
    displayname_lang_itit text NULL,
    displayname_lang_unk  text NULL,
    displayname_lang_mask int8   DEFAULT 0 NOT NULL,
    description_lang_enus text NULL,
    description_lang_engb text NULL,
    description_lang_kokr text NULL,
    description_lang_frfr text NULL,
    description_lang_dede text NULL,
    description_lang_encn text NULL,
    description_lang_zhcn text NULL,
    description_lang_entw text NULL,
    description_lang_zhtw text NULL,
    description_lang_eses text NULL,
    description_lang_esmx text NULL,
    description_lang_ruru text NULL,
    description_lang_ptpt text NULL,
    description_lang_ptbr text NULL,
    description_lang_itit text NULL,
    description_lang_unk  text NULL,
    description_lang_mask int8   DEFAULT 0 NOT NULL,
    cost_modifier         float4 DEFAULT 0 NOT NULL,
    race                  int4   DEFAULT 0 NOT NULL,
    sex                   int4   DEFAULT 0 NOT NULL,
    "data"                int4   DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_barbershopstyle_pkey PRIMARY KEY (id)
);
INSERT INTO dbc.dbc_barbershopstyle (id, "type", displayname_lang_enus, displayname_lang_engb, displayname_lang_kokr,
                                     displayname_lang_frfr, displayname_lang_dede, displayname_lang_encn,
                                     displayname_lang_zhcn, displayname_lang_entw, displayname_lang_zhtw,
                                     displayname_lang_eses, displayname_lang_esmx, displayname_lang_ruru,
                                     displayname_lang_ptpt, displayname_lang_ptbr, displayname_lang_itit,
                                     displayname_lang_unk, displayname_lang_mask, description_lang_enus,
                                     description_lang_engb, description_lang_kokr, description_lang_frfr,
                                     description_lang_dede, description_lang_encn, description_lang_zhcn,
                                     description_lang_entw, description_lang_zhtw, description_lang_eses,
                                     description_lang_esmx, description_lang_ruru, description_lang_ptpt,
                                     description_lang_ptbr, description_lang_itit, description_lang_unk,
                                     description_lang_mask, cost_modifier, race, sex, "data")
VALUES (3, 0, 'Long', 'Long', '긴 머리', 'Longs', 'Lang', '直长发', '直长发', '長', '長', 'Largo', 'Largo',
        'Длинные волосы', '', '', '', '', 16712190, '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '',
        16712173, 1.0, 11, 0, 0);

CREATE TABLE dbc.dbc_battlemasterlist
(
    id                 int4 DEFAULT 0 NOT NULL,
    mapid_1            int4 DEFAULT 0 NOT NULL,
    mapid_2            int4 DEFAULT 0 NOT NULL,
    mapid_3            int4 DEFAULT 0 NOT NULL,
    mapid_4            int4 DEFAULT 0 NOT NULL,
    mapid_5            int4 DEFAULT 0 NOT NULL,
    mapid_6            int4 DEFAULT 0 NOT NULL,
    mapid_7            int4 DEFAULT 0 NOT NULL,
    mapid_8            int4 DEFAULT 0 NOT NULL,
    instance_type      int4 DEFAULT 0 NOT NULL,
    groups_allowed     int4 DEFAULT 0 NOT NULL,
    name_lang_enus     text NULL,
    name_lang_engb     text NULL,
    name_lang_kokr     text NULL,
    name_lang_frfr     text NULL,
    name_lang_dede     text NULL,
    name_lang_encn     text NULL,
    name_lang_zhcn     text NULL,
    name_lang_entw     text NULL,
    name_lang_zhtw     text NULL,
    name_lang_eses     text NULL,
    name_lang_esmx     text NULL,
    name_lang_ruru     text NULL,
    name_lang_ptpt     text NULL,
    name_lang_ptbr     text NULL,
    name_lang_itit     text NULL,
    name_lang_unk      text NULL,
    name_lang_mask     int8 DEFAULT 0 NOT NULL,
    max_group_size     int4 DEFAULT 0 NOT NULL,
    holiday_worldstate int4 DEFAULT 0 NOT NULL,
    minlevel           int4 DEFAULT 0 NOT NULL,
    maxlevel           int4 DEFAULT 0 NOT NULL,
    CONSTRAINT dbc_battlemasterlist_pkey PRIMARY KEY (id)
);
INSERT INTO dbc.dbc_battlemasterlist (id, mapid_1, mapid_2, mapid_3, mapid_4, mapid_5, mapid_6, mapid_7, mapid_8,
                                      instance_type, groups_allowed, name_lang_enus, name_lang_engb, name_lang_kokr,
                                      name_lang_frfr, name_lang_dede, name_lang_encn, name_lang_zhcn, name_lang_entw,
                                      name_lang_zhtw, name_lang_eses, name_lang_esmx, name_lang_ruru, name_lang_ptpt,
                                      name_lang_ptbr, name_lang_itit, name_lang_unk, name_lang_mask, max_group_size,
                                      holiday_worldstate, minlevel, maxlevel)
VALUES (1, 30, -1, -1, -1, -1, -1, -1, -1, 3, 1, 'Alterac Valley', 'Alterac Valley', '알터랙 계곡', 'Vallée d''Alterac',
        'Alteractal', '奥特兰克山谷', '奥特兰克山谷', '奧特蘭克山谷', '奧特蘭克山谷', 'Valle de Alterac',
        'Valle de Alterac', 'Альтеракская долина', '', '', '', '', 16712190, 5, 1941, 51, 80);

CREATE TABLE dbc.dbc_characterfacialhairstyles
(
    id          int4 DEFAULT 0 NOT NULL,
    raceid      int4 DEFAULT 0 NOT NULL,
    sexid       int4 DEFAULT 0 NOT NULL,
    variationid int4 DEFAULT 0 NOT NULL,
    geoset_1    int4 DEFAULT 0 NOT NULL,
    geoset_2    int4 DEFAULT 0 NOT NULL,
    geoset_3    int4 DEFAULT 0 NOT NULL,
    geoset_4    int4 DEFAULT 0 NOT NULL,
    geoset_5    int4 DEFAULT 0 NOT NULL,
    CONSTRAINT pk_dbc_characterfacialhairstyles PRIMARY KEY (id)
);
INSERT INTO dbc.dbc_characterfacialhairstyles (id, raceid, sexid, variationid, geoset_1, geoset_2, geoset_3, geoset_4,
                                               geoset_5)
VALUES (1, 1, 0, 1, 1, 2, 1, 0, 0);

CREATE TABLE dbc.dbc_charsections
(
    id             int4 DEFAULT 0 NOT NULL,
    raceid         int4 DEFAULT 0 NOT NULL,
    sexid          int4 DEFAULT 0 NOT NULL,
    basesection    int4 DEFAULT 0 NOT NULL,
    texturename_1  text NULL,
    texturename_2  text NULL,
    texturename_3  text NULL,
    flags          int4 DEFAULT 0 NOT NULL,
    variationindex int4 DEFAULT 0 NOT NULL,
    colorindex     int4 DEFAULT 0 NOT NULL,
    CONSTRAINT pk_dbc_charsections PRIMARY KEY (id)
);
INSERT INTO dbc.dbc_charsections
(id, raceid, sexid, basesection, texturename_1, texturename_2, texturename_3, flags, variationindex, colorindex)
VALUES (1, 1, 0, 0, 'Character\Human\Male\HumanMaleSkin00_00.blp', '', '', 17, 0, 0);