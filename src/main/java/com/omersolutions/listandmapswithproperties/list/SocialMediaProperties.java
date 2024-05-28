package com.omersolutions.listandmapswithproperties.list;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "social.media")
public record SocialMediaProperties(List<SocialMediaAccount> accounts) {
}
