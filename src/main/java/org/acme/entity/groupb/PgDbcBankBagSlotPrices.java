package org.acme.entity.groupb;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "dbc_bankbagslotprices", schema = "dbc")
@Data
@EqualsAndHashCode(callSuper = false)
public class PgDbcBankBagSlotPrices extends PanacheEntityBase {

    @Id
    @Column(
            name = "id",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0"
    )
    public Integer id;

    @Column(
            name = "cost",
            nullable = false,
            columnDefinition = "int4 DEFAULT 0"
    )
    public Integer cost;
}
