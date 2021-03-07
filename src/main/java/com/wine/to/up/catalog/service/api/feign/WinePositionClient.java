package com.wine.to.up.catalog.service.api.feign;

import com.wine.to.up.catalog.service.api.dto.WinePositionTrueResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface WinePositionClient {
    @RequestLine(value = "GET /position/true/trueSettings")
    @Headers("Content-Type: application/json")
    public List<WinePositionTrueResponse> getAllWinePositionsTrue(@Param("page") String page,
                                                                  @Param("amount") String amount,
                                                                  @Param("sortByPair") List<String> sortByPair,
                                                                  @Param("filterBy") String filterBy);
}
