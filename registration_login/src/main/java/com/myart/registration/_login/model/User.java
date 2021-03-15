package com.myart.registration._login.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myart.registration._login.web.data.UserRegistrationData;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table
public class User {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    String username;

    // kann nicht leer sein und 15 stellen
    @Column(nullable = false, length = 15)
    String password;


    // einzigartig email nur einmal
    @Column(nullable = false, unique = true, length = 55)
    private String email;

    @Column(nullable = false,length = 20)
    private String firstname;

    @Column(nullable = false,length = 20)
    private String lastname;

    public User() {

    }

    public User(String username, String password, String email, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
