package pers.zuzi.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


/**
 * @author guohezuzi
 * //FIXME 这只是一个demo 记得删掉重写自己的domain哦
 */
@Data
@Table(name = "article")
public class Article {
    /**
     * ID
     */
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer articleId;

    /**
     * 文章标签,多个标签以;分隔
     */
    @Column(name = "article_tag")
    private String articleTag;

    /**
     * 文章标题
     */
    @Column(name = "article_title")
    private String articleTitle;

    /**
     * 文章作者
     */
    @Column(name = "article_author")
    private String articleAuthor;

    /**
     * 文章图片url 多张图片以,分隔
     */
    @Column(name = "article_title_pic_url")
    private String articleTitlePicUrl;

    /**
     * 文章创建时间
     */
    @Column(name = "article_create_time")
    private Date articleCreateTime;

    /**
     * 文章最后修改时间
     */
    @Column(name = "article_last_update_time")
    private Date articleLastUpdateTime;

    /**
     * 文章内容
     */
    @Column(name = "article_content")
    private String articleContent;

}