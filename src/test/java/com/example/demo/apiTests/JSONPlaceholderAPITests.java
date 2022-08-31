package com.example.demo.apiTests;


import com.example.demo.infra.api.JSONPlaceholderAPI;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
@SpringBootTest
public class JSONPlaceholderAPITests {


    @Test
    public void apiTest() throws IOException {
        JSONPlaceholderAPI api = new JSONPlaceholderAPI();
        api.getAlbums();
    }

}
