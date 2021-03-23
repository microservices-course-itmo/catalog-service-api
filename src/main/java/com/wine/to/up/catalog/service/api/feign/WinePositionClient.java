package com.wine.to.up.catalog.service.api.feign;

import com.wine.to.up.catalog.service.api.dto.WinePositionTrueResponse;
import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

public interface WinePositionClient {
    @RequestLine(value = "GET /position/true/trueSettings")
    @Headers("Content-Type: application/json")
    List<WinePositionTrueResponse> getAllWinePositionsTrue(@QueryMap Map<String, List<String>> settings);
}
