package thomas.springframework.msscbrewe.services.v2;

import thomas.springframework.msscbrewe.web.model.BeerDto;
import thomas.springframework.msscbrewe.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author vvthuy on 12/18/2020
 * @project mssc-brewery
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
