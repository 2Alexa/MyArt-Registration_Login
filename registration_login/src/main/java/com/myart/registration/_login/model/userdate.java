package com.myart.registration._login.model;

import javax.persistence.*;

@Entity
@Table (name="userdate")
public class userdate {

    //primäreKey
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public userdate() {
    }
    public userdate(String name){
        super();
        this.name=name;
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
}
