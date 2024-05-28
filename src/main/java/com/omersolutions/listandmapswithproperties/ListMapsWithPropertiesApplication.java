package com.omersolutions.listandmapswithproperties;

import com.omersolutions.listandmapswithproperties.list.SocialMediaProperties;
import com.omersolutions.listandmapswithproperties.map.BookmarkProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({SocialMediaProperties.class, BookmarkProperties.class})
@SpringBootApplication
public class ListMapsWithPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListMapsWithPropertiesApplication.class, args);
    }

}
