package com.oms.model;

import javax.persistence.*;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "article")
public class Article extends CoreEntity {

  @Column(name = "logical_id")
  private String logicalId;

  @Column(name = "quantity")
  private Long quantity;

  @Column(name = "warn_quantity")
  private Long warnQuantity;

  @Column(name = "sale_price")
  private Long salePrice;

  @Column(name = "provider_price")
  private Long providerPrice;

  @JoinColumn(name = "article_category_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private ArticleCategory articleCategory;
  
  @JoinColumn(name = "unit_of_measure_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private UnitOfMeasure unitOfMeasure;

  @JoinColumn(name = "article_type_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private ArticleType articleType;

  @JoinColumn(name = "provider_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private Unit provider;

  @PreUpdate
  @PrePersist
  public void prePersistUpdate(){

  }

  public String getLogicalId() {
    return logicalId;
  }

  public void setLogicalId(String logicalId) {
    this.logicalId = logicalId;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Long getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(Long salePrice) {
    this.salePrice = salePrice;
  }

  public Long getProviderPrice() {
    return providerPrice;
  }

  public void setProviderPrice(Long providerPrice) {
    this.providerPrice = providerPrice;
  }

  public ArticleCategory getArticleCategory() {
    return articleCategory;
  }

  public void setArticleCategory(ArticleCategory articleCategory) {
    this.articleCategory = articleCategory;
  }

  public ArticleType getArticleType() {
    return articleType;
  }

  public void setArticleType(ArticleType articleType) {
    this.articleType = articleType;
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

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
