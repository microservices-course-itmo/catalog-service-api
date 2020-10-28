package com.wine.to.up.catalog.service.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UpdatePriceEvent {
    private String id;

    private String name;

    private double price;
}
