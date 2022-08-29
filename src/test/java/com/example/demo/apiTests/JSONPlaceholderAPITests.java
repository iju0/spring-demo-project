package com.example.demo.apiTests;


import com.example.demo.infra.api.JSONPlaceholderAPI;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JSONPlaceholderAPITests {


    @Test
    public void apiTest() throws IOException {
        JSONPlaceholderAPI api = new JSONPlaceholderAPI();
        api.getAlbums();
    }

}
