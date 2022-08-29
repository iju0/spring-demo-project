package com.example.demo.controller;

import com.example.demo.service.IAlbumService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class AlbumController {

    private IAlbumService albumService;
    public AlbumController(IAlbumService albumService) {
        this.albumService = albumService;
    }

    @RequestMapping("/album")
    public String FindAlbums(Model model) throws IOException {
        model.addAttribute("albums", albumService.findAlbums());
        return "album";
    }

}
