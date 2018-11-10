package pers.zuzi.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: guohezuzi
 * \* Date: 2018-11-10
 * \* Time: 下午2:45
 * //FIXME 这只是一个demo 记得删掉重写自己的测试哦
 * \
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getAllArticles() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/articles")).andDo(MockMvcResultHandlers.print());
    }
}