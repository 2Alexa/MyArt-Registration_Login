package com.myart.registration._login.model;


import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name ="tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    //
    @ManyToMany
    private Set<Art> arts;

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

    public Set<Art> getArts() {
        return arts;
    }

    public void setArts(Set<Art> arts) {
        this.arts = arts;
    }

    //
    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if (!(o instanceof Tag)) return false;
        Tag tag =(Tag) o;
        return name.equals(tag.name);
    }

    //
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
