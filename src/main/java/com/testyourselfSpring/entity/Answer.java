package com.testyourselfSpring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "name", length = 128, nullable = false)
    private String name;
    @Column(name = "question_id", nullable = false, insertable = false, updatable = false)
    private Long question_id;
    @Column(name = "is_correct", length = 1, nullable = false)
    private boolean correct;

    @ManyToMany
    @JoinTable(name = "answer_question",
            joinColumns = @JoinColumn(name = "answer_id", referencedColumnName = "question_id"))
    private List<Question> question = new ArrayList<>();

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getIsCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Long question_id) {
        this.question_id = question_id;
    }

    @Override
    public String toString() {
        return "Answer [id=" + id + ", name=" + name + ", correct=" + correct + "]";
    }
}
