package com.omersolutions.listandmapswithproperties.list;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SocialMediaPropertiesTests {

    @Autowired
    SocialMediaProperties properties;

    @Test
    void shouldListAllSocialMediaAccounts() {
        List<SocialMediaAccount> accounts= properties.accounts();
        assertEquals(4, accounts.size());
    }
    @Test
    void shouldGetTwitterAccount() {
        List<SocialMediaAccount> accounts= properties.accounts();
        SocialMediaAccount twitter = accounts.get(1);
        assertEquals("Twitter", twitter.name());
        assertEquals("twitter", twitter.username());
        assertEquals("https://www.twitter.com", twitter.url());
    }
    @Test
    void shouldGetInstagramAccount() {
        List<SocialMediaAccount> accounts= properties.accounts();
        SocialMediaAccount instagram = accounts.get(3);
        assertEquals("Instagram", instagram.name());
        assertEquals("instagram", instagram.username());
        assertEquals("https://www.instagram.com", instagram.url());
    }
    @Test
    void shouldGetLinkedInAccount() {
        List<SocialMediaAccount> accounts= properties.accounts();
        SocialMediaAccount linkedIn = accounts.get(2);
        assertEquals("LinkedIn", linkedIn.name());
        assertEquals("linkedin", linkedIn.username());
        assertEquals("https://www.linkedin.com", linkedIn.url());
    }
}