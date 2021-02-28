package com.wine.to.up.catalog.service.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GrapeResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

}
