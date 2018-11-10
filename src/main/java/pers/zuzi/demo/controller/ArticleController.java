package pers.zuzi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pers.zuzi.demo.dao.ArticleMapper;
import pers.zuzi.demo.domain.Article;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: guohezuzi
 * \* Date: 2018-11-10
 * \* Time: 下午2:41
 * \* Description:控制器demo //FIXME 这只是一个demo 记得删掉重写自己的控制器哦 还有增加service层
 * \
 */
@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    @Autowired
    private ArticleMapper mapper;

    @RequestMapping(method = RequestMethod.GET)
    public List<Article> getAllArticles(){
        return mapper.selectAll();
    }
}
