package com.oms.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "unit_of_measure")
public class UnitOfMeasure extends CoreEntity {

  /**
   * unitar type is set with 0 value in case when the article quantity is possible to count as integers.
   * Example #1: KG of apples - it is hard to count the apples in one KG, so in this case the unit's
   * of articles in order will be equals with one.
   * Example #2: piece, pack - we know exactly how many count of article we have. In this case the value will be zero.
   */
  @Column(name = "unitar_type")
  private Integer unitarType;

  public boolean isUnitarType() {
    return getUnitarType() == 1;
  }

  public Integer getUnitarType() {
    return (unitarType == null) ? 1 : unitarType;
  }

  public void setUnitarType(Integer unitarType) {
    this.unitarType = unitarType;
  }
}
