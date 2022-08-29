package com.example.demo.album;


import java.util.List;
import java.util.Optional;

public interface IAlbumRepository {
    Optional<List<Album>> getAlbums();
}
