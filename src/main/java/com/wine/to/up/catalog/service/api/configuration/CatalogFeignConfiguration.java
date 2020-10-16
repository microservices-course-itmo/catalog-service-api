package com.wine.to.up.catalog.service.api.configuration;

import com.wine.to.up.catalog.service.api.CatalogServiceApiProperties;
import com.wine.to.up.catalog.service.api.feign.CatalogServiceClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Example of feign client
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
public class CatalogFeignConfiguration {
    private final CatalogServiceApiProperties catalogServiceApiProperties;

    /**
     * Configured feign client
     */
    @Bean
    public CatalogServiceClient getCatalogClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient())
                .target(CatalogServiceClient.class, "http://" + catalogServiceApiProperties.getHost());
    }
}
