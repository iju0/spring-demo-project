package com.example.demo.service;

import com.example.demo.entities.Album;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IAlbumService {
    List<Album> findAlbums() throws IOException;
}
