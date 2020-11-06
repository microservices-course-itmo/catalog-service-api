//TODO create-service: move ALL classes (not only this one) to correct package. F.e. for order-service-api all classes should be in "com.wine.to.up.order.service.api.*"
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
 * Feign client for accessing catalog service
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
//TODO create-service: rename
public class CatalogServiceFeignConfiguration {
    private final CatalogServiceApiProperties catalogServiceApiProperties;

    /**
     * Configured feign client
     */
    //TODO create-service: do not forget to change bean name (method name)
    @Bean
    public CatalogServiceClient getKafkaServiceClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient())
                .target(CatalogServiceClient.class, "http://" + catalogServiceApiProperties.getHost());
    }
}
