package com.myart.registration._login.repository;

import com.myart.registration._login.model.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

// interface für methode, automatich für datenbank . anfrage db
@Repository
public interface TagRepository extends PagingAndSortingRepository<Tag, Long> {

    }




