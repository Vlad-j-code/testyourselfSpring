package com.testyourselfSpring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {
    private static final long serialVersionUID = 4198285481198237650L;
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "name", length = 128, nullable = false)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Role [id = " + id + ", name = " + name + "]";
    }
}
