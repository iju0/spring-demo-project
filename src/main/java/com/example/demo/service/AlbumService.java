package com.example.demo.album;

import com.example.demo.album.IAlbumService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements IAlbumService {

    public AlbumService() {

    }

    @Override
    public Optional<List<Album>> findAlbums() {
        return Optional.empty();
    }
}
