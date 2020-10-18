package com.wine.to.up.catalog.service.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class NotificationServiceMessage {
    private String id;

    private String name;

    private double price;
}
