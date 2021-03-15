package com.myart.registration._login.service;


import com.myart.registration._login.model.Art;
import com.myart.registration._login.repository.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

//
@Service
public class ArtService {

    //
    @Autowired
    private ArtRepository repository;

    //
    public Art getRandom(){
        //
        long total =repository.count();
        //
        long random =(long) (Math.random() * total);
        return repository.findFirstByIdGreaterThanEqual(random);
    }

    //
    public Art findRandomByTag (String tag){
        //
        long total = repository.countByTagsNameIgnoreCase(tag);
        //
        long random = (long) (Math.random() * total);
        //
        PageRequest oneItemPerPageRequest = PageRequest.of((int) random, 1);
        //
        Page<Art> page =repository.findByTagsNameIgnoreCase(tag, oneItemPerPageRequest);
        //
        return page.get().findFirst().orElse(null);
    }

}
