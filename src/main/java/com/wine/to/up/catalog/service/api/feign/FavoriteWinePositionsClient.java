package com.wine.to.up.catalog.service.api.feign;

import com.wine.to.up.catalog.service.api.dto.WinePositionTrueResponse;
import com.wine.to.up.catalog.service.api.service.FavoriteWinePositionsService;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import javax.validation.Valid;
import java.util.List;

public interface FavoriteWinePositionsClient extends FavoriteWinePositionsService {
    @RequestLine(value = "GET /position/true/favourites")
    @Headers("Content-Type: application/json")
    List<WinePositionTrueResponse> getFavourites(@Param("favouritePosition") List<String> favouritePosition);
}
