/*
 * Copyright (c) 2020 Andrsuh INC.
 * All Rights Reserved
 *
 * This software contains the intellectual property of Andrsuh INC or is
 * licensed to Dell EMC from third parties. Use of this software and the
 * intellectual property contained therein is expressly limited to the terms and
 * conditions of the License Agreement under which it is provided by or on behalf
 * of Andrsuh INC.
 */
package com.wine.to.up.catalog.service.api.service;

import com.wine.to.up.catalog.service.api.dto.CatalogServiceMessage;

import java.util.List;

/**
 * Defines an interface for communicating with kafka
 */
//TODO create-service: rename to reflect your endpoints meaning
public interface CatalogService {
    /**
     * Sends message to kafka topic
     *
     * @param message message
     */
    void sendMessage(String message);

    /**
     * Sends message to kafka topic with headers
     *
     * @param messageWithHeaders message with headers
     */
    void sendMessageWithHeaders(CatalogServiceMessage messageWithHeaders);

    /**
     * Get district message content from DB
     *
     * @return list of message content
     */
    List<String> getSentMessages();
}
