package com.omersolutions.listandmapswithproperties.map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookmarkPropertiesTest {

    @Autowired
    BookmarkProperties properties;

    @Test
    void shouldListAllWebsites() {
        assertEquals(4, properties.websiteMap().size());
    }

    @Test
    void shouldDanVegaWebsite() {
        Website google = properties.websiteMap().get("dan-vega");
        assertEquals("https://www.danvega.dev", google.url());
    }

    @Test
    void shouldBaeldungWebsite() {
        Website yahoo = properties.websiteMap().get("Baeldung");
        assertEquals("https://www.baeldung.com", yahoo.url());
    }

    @Test
    void shouldSpringWebsite() {
        Website bing = properties.websiteMap().get("spring-framework");
        assertEquals("https://spring.io", bing.url());
    }

    @Test
    void shouldOkayingWebsite() {
        Website okaying = properties.websiteMap().get("okaying");
        assertEquals("https://www.mkyong.com", okaying.url());
    }
}