package com.myart.registration._login.service;


import com.myart.registration._login.model.Tag;
import com.myart.registration._login.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    //
    @Autowired
    private TagRepository tagRepository;

    //
    public List<Tag> findFirstTen(){
        //
        PageRequest firstTenPage = PageRequest.of(0,10);
        //
        Page<Tag> page = tagRepository.findAll(firstTenPage);
        return page.getContent();
    }
}
