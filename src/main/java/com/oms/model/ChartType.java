package com.oms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "chart_type")
public class ChartType extends CoreEntity {

  @Column(name = "ui_type")
  private String uiType;

  public String getUiType() {
    return uiType;
  }

  public void setUiType(String uiType) {
    this.uiType = uiType;
  }

}
