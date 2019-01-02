package com.oms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "inventory")
public class Inventory extends CoreEntity {
    
  @JoinColumn(name = "inventory_status_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private InventoryStatus inventoryStatus;
  
  @JoinColumn(name = "inventory_type_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private InventoryType inventoryType;

  @JoinColumn(name = "unit_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Unit provider;

  @Column(name = "quantity")
  private Long quantity;
  
  @Column(name = "warn_quantity")
  private Long warnQuantity;
  
    public InventoryStatus getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(InventoryStatus inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public InventoryType getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(InventoryType inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getWarnQuantity() {
        return warnQuantity;
    }

    public void setWarnQuantity(Long warnQuantity) {
        this.warnQuantity = warnQuantity;
    }

  public Unit getProvider() {
    return provider;
  }

  public void setProvider(Unit provider) {
    this.provider = provider;
  }
}
