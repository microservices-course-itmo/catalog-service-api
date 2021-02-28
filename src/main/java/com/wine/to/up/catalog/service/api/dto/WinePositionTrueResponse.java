package com.wine.to.up.catalog.service.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WinePositionTrueResponse {
    @JsonProperty("wine_position_id")
    private String wine_position_id;

    @JsonProperty("shop")
    private ShopResponse shop;

    @JsonProperty("wine")
    private WineTrueResponse wineTrueResponse;

    @JsonProperty("price")
    private float price;

    @JsonProperty("actual_price")
    private float actual_price;

    @JsonProperty("link_to_wine")
    private String link_to_wine;

    @JsonProperty("volume")
    private float volume;

    @JsonProperty("description")
    private String description;

    @JsonProperty("gastronomy")
    private String gastronomy;

    @JsonProperty("image")
    private String image;

    @JsonProperty("country")
    private String country;
}
