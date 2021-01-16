package com.hellomybody.hmb.bean;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/*
    实体类与mongodb中的集合 名字对应时，可以实现映射绑定，否则，需要用@Document来映射绑定
    @Document(collection="mongodb 对应 collection 名")
    若未加 @Document ，该 bean save 到 mongo 的 comment collection  【本身不存在的集合会新增】
    若添加 @Document ，则 save 到 comment collection
 */
//@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Document("question")
public class Question implements Serializable {
    @Id
    private String id;
    private String articleId;
    private String name;
    private String title;
    private String news;
    private String asktime;
    private String vote_up;
    private String vote_down;

    public Question() {
    }

    public Question(String name, String articleId, String title, String news, String asktime, String vote_up, String vote_down) {
        this.articleId = articleId;
        this.name = name;
        this.title = title;
        this.news = news;
        this.asktime = asktime;
        this.vote_up = vote_up;
        this.vote_down = vote_down;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getAsktime() {
        return asktime;
    }

    public void setAsktime(String asktime) {
        this.asktime = asktime;
    }

    public String getVote_up() {
        return vote_up;
    }

    public void setVote_up(String vote_up) {
        this.vote_up = vote_up;
    }

    public String getVote_down() {
        return vote_down;
    }

    public void setVote_down(String vote_down) {
        this.vote_down = vote_down;
    }

    @Override
    public String toString() {
        return "Question [" +
                "id=" + id +
                "articleId=" + articleId +
                ", name=" + name +
                ", title=" + title +
                ", news=" + news +
                ", asktime=" + asktime +
                ", vote_up=" + vote_up +
                ", vote_down=" + vote_down +
                "]";
    }
}
