package com.oms.service;

import com.oms.model.Article;
import com.oms.model.ArticleCategory;
import com.oms.model.Unit;
import com.oms.model.UnitType;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sdrahnea
 */
@Component
public class ArticleService extends AbstractService<Article> {

  public List<Article> getArticleListByCategory(ArticleCategory articleCategory){
    List<Article> result =
        entityManager.createQuery("FROM Article article WHERE article.articleCategory = :articleCategory")
            .setParameter("articleCategory", articleCategory)
            .getResultList();
    return result.isEmpty() ? new LinkedList<>() : result;
  }

}
