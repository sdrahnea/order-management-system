package com.oms.model;

import javax.persistence.*;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "article_category")
public class ArticleCategory extends CoreEntity {

  @JoinColumn(name = "parent_article_category_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private ArticleCategory parentArticleCategory;

  public ArticleCategory getParentArticleCategory() {
    return parentArticleCategory;
  }

  public void setParentArticleCategory(ArticleCategory parentArticleCategory) {
    this.parentArticleCategory = parentArticleCategory;
  }
}
