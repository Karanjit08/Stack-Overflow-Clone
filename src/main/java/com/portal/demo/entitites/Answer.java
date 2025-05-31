package com.portal.demo.entitites;


import jakarta.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;
    private int starRating = 0;

    @ManyToOne
    private UserProfile user;

    @ManyToOne
    private Question question;

    public Answer() {
        super();
    }

    public Answer(int id, String content, int starRating, UserProfile user, Question question) {
        this.id = id;
        this.content = content;
        this.starRating = starRating;
        this.user = user;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", starRating=" + starRating +
                ", user=" + user +
                ", question=" + question +
                '}';
    }
}
