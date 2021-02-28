package com.wine.to.up.catalog.service.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WineTrueResponse {
    @JsonProperty("wine_id")
    private String wine_id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("producer")
    private ProducerResponse producerResponse;

    @JsonProperty("brand")
    private BrandResponse brandResponse;

    @JsonProperty("region")
    private List<RegionResponse> regionResponse;

    @JsonProperty("grape")
    private List<GrapeResponse> grapeResponse;

    @JsonProperty("avg")
    private float avg;

    @JsonProperty("color")
    private String color;

    @JsonProperty("sugar")
    private String sugar;

    @JsonProperty("year")
    private int year;
}
