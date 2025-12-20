package org.acme.entity.groupa;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_areagroup", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcAreaGroup extends PanacheEntityBase {

    @Id
    @Column(name = "id", nullable = false)
    public Integer id;

    @Column(name = "areaid_1", nullable = false)
    public Integer areaid1;

    @Column(name = "areaid_2", nullable = false)
    public Integer areaid2;

    @Column(name = "areaid_3", nullable = false)
    public Integer areaid3;

    @Column(name = "areaid_4", nullable = false)
    public Integer areaid4;

    @Column(name = "areaid_5", nullable = false)
    public Integer areaid5;

    @Column(name = "areaid_6", nullable = false)
    public Integer areaid6;

    @Column(name = "nextareaid", nullable = false)
    public Integer nextareaid;
}
