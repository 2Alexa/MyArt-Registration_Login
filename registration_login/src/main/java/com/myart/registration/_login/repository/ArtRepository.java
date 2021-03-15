package com.myart.registration._login.repository;

import com.myart.registration._login.model.Art;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ArtRepository extends CrudRepository<Art,Long> {
    //
     Art findFirstByIdGreaterThanEqual(Long id);
    //
     Art findFirstByTagNameIgnoreCase(String tag);
     //
     Page<Art>findByTagNameIgnoreCase(String tag, Pageable page);
     //
     long countByTagNameIgnoreCase(String tag);


}
