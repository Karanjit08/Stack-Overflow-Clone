package com.portal.demo.entitites;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int contributionStreak = 0;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Answer> answers;

    public UserProfile() {
        super();
    }

    public UserProfile(int id, String name, int contributionStreak, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.contributionStreak = contributionStreak;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContributionStreak() {
        return contributionStreak;
    }

    public void setContributionStreak(int contributionStreak) {
        this.contributionStreak = contributionStreak;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contributionStreak=" + contributionStreak +
                ", answers=" + answers +
                '}';
    }
}
