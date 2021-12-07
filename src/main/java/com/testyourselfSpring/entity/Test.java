package com.testyourselfSpring.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "name", length = 128, nullable = false)
    private String name;
    @Column(name = "subject_id", nullable = false, insertable = false, updatable = false)
    private Long subject_id;
    @Column(name = "deadline")
    private LocalDateTime deadline;
    @Column(name = "score")
    private Long score;
    @Column(name = "level")
    private Long level;
    @Column(name = "popularity")
    private Long popularity;
    @Column(name = "duration")
    private int duration;

    public Test() {

    }

    public Test(String name, Long subject_id, LocalDateTime deadline, Long score, Long level, int duration) {
        this.name = name;
        this.subject_id = subject_id;
        this.deadline = deadline;
        this.score = score;
        this.level = level;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getPopularity() {
        return popularity;
    }

    public void setPopularity(Long popularity) {
        this.popularity = popularity;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());
        result = prime * result + duration;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((level == null) ? 0 : level.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((popularity == null) ? 0 : popularity.hashCode());
        result = prime * result + ((score == null) ? 0 : score.hashCode());
        result = prime * result + ((subject_id == null) ? 0 : subject_id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Test other = (Test) obj;
        if (deadline == null) {
            if (other.deadline != null)
                return false;
        } else if (!deadline.equals(other.deadline))
            return false;
        if (duration != other.duration)
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (level == null) {
            if (other.level != null)
                return false;
        } else if (!level.equals(other.level))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (popularity == null) {
            if (other.popularity != null)
                return false;
        } else if (!popularity.equals(other.popularity))
            return false;
        if (score == null) {
            if (other.score != null)
                return false;
        } else if (!score.equals(other.score))
            return false;
        if (subject_id == null) {
            if (other.subject_id != null)
                return false;
        } else if (!subject_id.equals(other.subject_id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Test [id=" + id + ", name=" + name + ", subject=" + subject_id + ", deadline=" + deadline + ", score="
                + score + ", level=" + level + ", popularity=" + popularity + ", duration=" + duration + "]";
    }
}
