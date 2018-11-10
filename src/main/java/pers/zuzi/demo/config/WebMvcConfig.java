package pers.zuzi.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pers.zuzi.demo.security.interceptor.DemoInterceptor;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: guohezuzi
 * \* Date: 2018-11-10
 * \* Time: 下午3:05
 * \* Description:spring web mvc 配置
 * \
 */
@Configuration
public class WebMvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //主页重定向到api文档
        registry.addRedirectViewController("/","/swagger-ui.html");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/**");
    }
}
