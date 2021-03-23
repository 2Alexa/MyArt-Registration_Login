package com.myart.registration._login.controller;

import com.myart.registration._login.model.Art;
import com.myart.registration._login.model.Tag;
import com.myart.registration._login.repository.ArtRepository;
import com.myart.registration._login.service.ArtService;
import com.myart.registration._login.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class ArtController {

    //
    @Autowired
    private ArtService artService;

    @Autowired
    private TagService tagService;

    //
    @GetMapping("/")
    public String getRandomImage(Model model) {
        //
        Art randomArt = artService.getRandom();
        return getImage(model, randomArt);
    }

    //
    @GetMapping("/tags/{tag}")
    public String getRandomImageByTag(@PathVariable("tag") String tag, Model model) {
        Art randomArt = artService.findRandomByTag(tag);
        return getImage(model, randomArt);
    }



    // methode getImage, Liste mit tags erstellt, zufälliges kunstwerk mit einem tag
    private String getImage(Model model, Art randomArt) {
        List<Tag> tag = tagService.findFirstTen();
        model.addAttribute("tags", tag);
        model.addAttribute("art", randomArt);
        return "Home";
    }

}
