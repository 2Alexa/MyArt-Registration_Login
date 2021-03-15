package com.myart.registration._login.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="arts")
public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = false)
    String name;

    @Column(nullable = false, unique = true)
    String url;

    @ManyToMany
    @JoinTable(
            name="art-tags",
            joinColumns = @JoinColumn(name="art_id"),
            inverseJoinColumns = @JoinColumn(name ="tag_id")
    )
    private Set<Tag> tags;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    @Override
    //
    public boolean equals(Object o){
        if(this == o)return true;
        if (!(o instanceof Art)) return false;
        Art art = (Art)o;
        return url.equals(art.url);
    }

    @Override
    public int hashCode(){
        return Objects.hash(url);
    }
}
