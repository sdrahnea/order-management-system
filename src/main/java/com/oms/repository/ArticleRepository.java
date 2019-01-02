package com.oms.repository;

import com.oms.model.Article;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sdrahnea
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {

}