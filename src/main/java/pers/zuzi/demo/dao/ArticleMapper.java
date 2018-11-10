package pers.zuzi.demo.dao;

import org.springframework.stereotype.Repository;
import pers.zuzi.demo.domain.Article;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author guohezuzi
 * //FIXME 这只是一个demo 记得删掉重写自己的dao层哦
 */
@Repository
public interface ArticleMapper extends Mapper<Article> {
}