package com.example.demo.service;

import com.example.demo.infra.api.JSONPlaceholderAPI;
import com.example.demo.repositories.AlbumRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AlbumServiceTests {

    private JSONPlaceholderAPI jsonPlaceholderAPI;
    private AlbumRepository albumRepository;
    private AlbumService albumService;

    @BeforeEach
    public void beforeEach() {
        jsonPlaceholderAPI = new JSONPlaceholderAPI();
        albumRepository = new AlbumRepository(jsonPlaceholderAPI);
        albumService = new AlbumService(albumRepository);
    }

    @Test
    public void FindAll() throws IOException {
        var results = albumService.findAlbums();

        for (var result: results) {
            System.out.println(result.getTitle());
        }

    }

}
