package com.example.demo.service;

import com.example.demo.entities.Album;
import com.example.demo.repositories.AlbumRepository;
import com.example.demo.repositories.IAlbumRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements IAlbumService {

    private IAlbumRepository albumRepository;

    public AlbumService(IAlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAlbums() throws IOException {
        return this.albumRepository.getAlbums();
    }
}
