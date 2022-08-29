package com.example.demo.album;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlbumController {

    private IAlbumService albumService;
    public AlbumController(IAlbumService albumService) {
        this.albumService = albumService;
    }

    @RequestMapping("/album")
    public String FindAlbums() {
        return "album";
    }

}
