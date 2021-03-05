package com.myart.registration._login.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myart.registration._login.web.data.UserRegistrationData;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table (name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    String username;

    @JsonIgnore
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

    //zweiseitigeBeziehung zw user und userdate, ruft Daten immer ab, immer gefüllt mit Operationen möglich
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //primäre Key von User und primäre Key von userdate werden verknüpft, 3 table sind created user, userdate, user_userdate
    @JoinTable(
            name="users_userdates",
            joinColumns = @JoinColumn(
                    name="user_id",referencedColumnName = "id"))


    private Collection<userdate> userdates;


    public User(String registrationData) {
        this.id = id;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public <T> User(String firstname, String lastname, String email, String password, List<T> userdata_user) {
    }


    public Long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
