package thomas.springframework.msscbrewe.services.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import thomas.springframework.msscbrewe.web.model.BeerDto;
import thomas.springframework.msscbrewe.web.model.v2.BeerDtoV2;
import thomas.springframework.msscbrewe.web.model.v2.BeerStyleEnum;

import java.util.UUID;

/**
  *@project mssc-brewery
  *@author vvthuy on 12/18/2020
  *
*/
@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Thomas")
                .beerStyle(BeerStyleEnum.GOSE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(BeerStyleEnum.ALE)
                .upc(beerDto.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo impl - would
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
