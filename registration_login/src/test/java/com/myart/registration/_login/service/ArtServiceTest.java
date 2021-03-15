package com.myart.registration._login.service;

import com.myart.registration._login.model.Art;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ArtServiceTest {

    @Autowired
    private ArtService artService;

    @Test
    public void testGetRandom(){
        Art a = artService.getRandom();
        Assertions.assertThat(a).isNotNull();
    }

    @Test
    public void testGetRandomTag(){
        Art a = artService.findRandomByTag("positiv");
        Assertions.assertThat(a).isNotNull();

    }

}