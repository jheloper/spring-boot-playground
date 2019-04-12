package com.example.demo.controller;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DemoControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void equalsHomeMessage() throws MalformedURLException, URISyntaxException {

        final URI uri = new URL("http://localhost:9100").toURI();

        final RequestEntity requestEntity = new RequestEntity(HttpMethod.GET, uri);

        final ResponseEntity<String> responseEntity =
                restTemplate.exchange(requestEntity, String.class);

        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assert.assertEquals("Hello, Spring boot!", responseEntity.getBody());
    }
}
