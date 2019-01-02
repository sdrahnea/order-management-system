package com.oms.controller;

import com.oms.model.Article;
import com.oms.model.ArticleCategory;
import com.oms.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/article")
public class ArticleController extends AbstractController<Article> {

  @Autowired
  private ArticleService articleService;

  public List<Article> getArticleListByCategory(ArticleCategory articleCategory) {
    return articleService.getArticleListByCategory(articleCategory);
  }
}