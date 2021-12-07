package com.testyourselfSpring.entity;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    private static final long serialVersionUID = -1958665644106842435L;
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "name", length = 128, nullable = false)
    @NotEmpty()
    private String name;
    @Column(name = "password", length = 128, nullable = false)
    @NotEmpty()
    private String password;

    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
            name="user_role",
            joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName="id")})
    private List<Role> roles;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + ", roleId=" + roles + "]";
    }
}
