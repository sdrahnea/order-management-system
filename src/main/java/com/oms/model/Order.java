package com.oms.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.UUID;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "i_order")
public class Order extends CoreEntity {

  @Column(name = "logical_id")
  private String logicalId;

  @JoinColumn(name="i_order_id")
  @OneToMany(cascade = CascadeType.ALL)
  @LazyCollection(LazyCollectionOption.FALSE)
  private Collection<Item> items = new LinkedHashSet<>();

  @JoinColumn(name = "unit_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Unit unit;

  @JoinColumn(name = "order_status_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private OrderStatus orderStatus;

  @JoinColumn(name = "order_type_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private OrderType orderType;

  @Lob
  @Column(name = "delivery_address")
  private String deliveryAddress;

  @Column(name = "total_price")
  private Long totalPrice;

  @Column(name = "total_unit")
  private Long totalUnit;
  
  @PreUpdate
  private void preUpdate(){
      totalPrice = new Long(0);
      totalUnit = new Long(0);
      for (Item item : items) {
          totalPrice += (item.getSaledPrice() * item.getQuantity());
          totalUnit += item.getQuantity();
      }
  }
  
  @PrePersist
  private void prePersist(){
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      logicalId = format.format(new Date()) + "-" 
              + UUID.randomUUID().toString().substring(0, 8);
      preUpdate();
  }
  
  public Collection<Item> getItems() {
    return items;
  }

  public void setItems(Collection<Item> items) {
    this.items = items;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public Long getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Long totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Long getTotalUnit() {
    return totalUnit;
  }

  public void setTotalUnit(Long totalUnit) {
    this.totalUnit = totalUnit;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }

  public String getLogicalId() {
    return logicalId;
  }

  public void setLogicalId(String logicalId) {
    this.logicalId = logicalId;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderType getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderType orderType) {
    this.orderType = orderType;
  }
}
