package com.example.demo.repositories;

import com.example.demo.entities.Album;
import com.example.demo.infra.api.IJSONPlaceholderAPI;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepository implements IAlbumRepository {

    private IJSONPlaceholderAPI jsonPlaceholderAPI;

    public AlbumRepository(IJSONPlaceholderAPI jsonPlaceholderAPI) {
        this.jsonPlaceholderAPI = jsonPlaceholderAPI;
    }

    @Override
    public List<Album> getAlbums() throws IOException {
        return jsonPlaceholderAPI.getAlbums();
    }
}
