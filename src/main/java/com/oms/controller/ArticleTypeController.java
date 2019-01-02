package com.oms.controller;

import com.oms.model.ArticleType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/article-type")
public class ArticleTypeController extends AbstractController<ArticleType> {
}