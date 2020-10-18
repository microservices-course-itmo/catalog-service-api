package com.wine.to.up.catalog.service.api;

import com.wine.to.up.catalog.service.api.domain.NotificationServiceMessage;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Defines values from properties. Can be autowired as a regular class
 */
@SuppressWarnings("SpringPropertySource")
@PropertySource("classpath:application-catalog-service-api-${spring.profiles.active:local}.properties")
@ConfigurationProperties(prefix = "catalog.service.api")
@Setter
@Component
@Getter
public class CatalogServiceApiProperties {
    private String host;

    private NotificationServiceMessage notificationTopic;
}