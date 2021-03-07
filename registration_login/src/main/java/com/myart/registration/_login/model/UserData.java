package com.myart.registration._login.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table (name="userdate")
public class UserData {

    //primäreKey
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//darf nicht leer sein, auch keine leerzeichen, am sichersten
    @NotBlank
    private String name;

    public UserData() {
    }
    public UserData(String name){
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

