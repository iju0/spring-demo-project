package com.example.demo.album;

import com.example.demo.album.IAlbumRepository;

import java.util.List;
import java.util.Optional;

public class AlbumRepository implements IAlbumRepository {
    @Override
    public Optional<List<Album>> getAlbums() {
        return Optional.empty();
    }
}
