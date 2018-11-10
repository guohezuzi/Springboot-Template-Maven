package pers.zuzi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author guohezuzi
 */
@SpringBootApplication
@EnableTransactionManagement
@tk.mybatis.spring.annotation.MapperScan(basePackages = "pers.zuzi.demo.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
