package com.wine.to.up.catalog.service.api.service;

import com.wine.to.up.catalog.service.api.dto.WinePositionTrueResponse;

import javax.validation.Valid;
import java.util.List;

public interface FavoriteWinePositionsService {
    List<WinePositionTrueResponse> getFavourites(List<String> favouritePosition);
}
