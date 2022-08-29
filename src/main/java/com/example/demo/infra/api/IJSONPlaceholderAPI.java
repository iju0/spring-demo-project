package com.example.demo.infra.api;

import com.example.demo.entities.Album;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Optional;

public interface IJSONPlaceholderAPI {
    List<Album> getAlbums() throws IOException;
}
