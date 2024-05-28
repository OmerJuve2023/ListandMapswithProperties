package com.omersolutions.listandmapswithproperties.map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
@ConfigurationProperties(prefix = "bookmark")
public record BookmarkProperties(Map<String, Website> websiteMap) {
}
