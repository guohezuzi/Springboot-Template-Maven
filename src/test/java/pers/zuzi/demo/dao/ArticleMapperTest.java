package pers.zuzi.demo.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.zuzi.demo.domain.Article;

import java.io.IOException;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: guohezuzi
 * \* Date: 2018-11-10
 * \* Time: 下午2:25
 * //FIXME 这只是一个demo 记得删掉重写自己的控制器哦
 * \
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {
    @Autowired
    private ArticleMapper mapper;

    @Test
    public void test() throws IOException {
        List<Article> articles=mapper.selectAll();
        ObjectMapper objectMapper=new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(articles));
    }

}