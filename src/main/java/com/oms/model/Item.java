package com.oms.model;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "item")
public class Item extends CoreEntity {

  @JoinColumn(name = "article_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Article article;
  
  @JoinColumn(name = "unit_of_measure_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private UnitOfMeasure unitOfMeasure;

  @JoinColumn(name = "article_category_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private ArticleCategory articleCategory;

  @JoinColumn(name = "i_order_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Order order;

  @Column(name = "quantity")
  private Long quantity;

  @Column(name = "total_price")
  private Long totalPrice;

  @Column(name = "saled_price")
  private Long saledPrice;

  @Column(name = "units")
  private Long units;

  @PreUpdate
  private void preUpdate(){
    totalPrice = new Long(0);
    if ((saledPrice != null) && (quantity != null)) {
      totalPrice += (saledPrice * quantity);
    }
  }

  @PrePersist
  private void prePersist(){
    preUpdate();
  }

  public Article getArticle() {
    return article == null ? new Article() : article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Long getSaledPrice() {
    return saledPrice;
  }

  public void setSaledPrice(Long saledPrice) {
    this.saledPrice = saledPrice;
  }

  public Long getUnits() {
    return units;
  }

  public void setUnits(Long units) {
    this.units = units;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public ArticleCategory getArticleCategory() {
    return articleCategory;
  }

  public void setArticleCategory(ArticleCategory articleCategory) {
    this.articleCategory = articleCategory;
  }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

  public Long getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Long totalPrice) {
    this.totalPrice = totalPrice;
  }
}
