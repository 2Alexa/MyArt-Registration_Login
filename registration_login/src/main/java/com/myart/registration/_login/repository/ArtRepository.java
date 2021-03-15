package com.myart.registration._login.repository;

import com.myart.registration._login.model.Art;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

//
public interface ArtRepository extends CrudRepository<Art,Long> {
    //find und gib erste ergebnis von db , wo eigenschaft id < /= ist, um zufall bild bekommen
     Art findFirstByIdGreaterThanEqual(Long id);
     //konzept seite , wie viel elemente pro seite dürfen sein, ein ergebnis oder keins
     Page<Art> findByTagsNameIgnoreCase(String tag, Pageable page);
     //
     long countByTagsNameIgnoreCase(String tag);


}
