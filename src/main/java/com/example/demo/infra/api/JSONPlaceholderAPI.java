package com.example.demo.infra.api;

import com.example.demo.entities.Album;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

@Component
public class JSONPlaceholderAPI implements IJSONPlaceholderAPI {

    private URL url;

    public JSONPlaceholderAPI() {
    }

    @Override
    public List<Album> getAlbums() throws IOException {

        List<Album> results = null;

        try{
            url = new URL("https://jsonplaceholder.typicode.com/albums");

            ObjectMapper objectMapper = new ObjectMapper();

            results = objectMapper.readValue(url, new TypeReference<List<Album>>() {});

//            for (var result: results) {
//                System.out.println(result.getId());
//                System.out.println(result.getTitle());
//                System.out.println(result.getUserId());
//            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return results;
    }
}
