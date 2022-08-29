package com.example.demo.repositories;


import com.example.demo.entities.Album;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IAlbumRepository {
    List<Album> getAlbums() throws IOException;
}
