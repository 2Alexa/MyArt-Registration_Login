package com.myart.registration._login.repository;

import com.myart.registration._login.model.Tag;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public class TagRepository extends PagingAndSortingRepository<Tag, Long> {
    Tag findByFirstTen(Long tag) {
        return null;
    }

}


