package com.wine.to.up.catalog.service.api.service;

import com.wine.to.up.catalog.service.api.dto.WinePositionTrueResponse;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

public interface FavoriteWinePositionsService {
    List<WinePositionTrueResponse> getFavourites(Map<String, List<String>> favouritePosition);
}
