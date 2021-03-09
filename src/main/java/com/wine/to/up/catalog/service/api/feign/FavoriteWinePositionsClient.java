package com.wine.to.up.catalog.service.api.feign;

import com.wine.to.up.catalog.service.api.dto.WinePositionTrueResponse;
import com.wine.to.up.catalog.service.api.service.FavoriteWinePositionsService;
import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

public interface FavoriteWinePositionsClient extends FavoriteWinePositionsService {
    @RequestLine(value = "GET /position/true/favourites")
    @Headers("Content-Type: application/json")
    List<WinePositionTrueResponse> getFavourites(@QueryMap Map<String, List<String>> favouritePosition);
}
