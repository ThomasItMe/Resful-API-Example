package thomas.springframework.msscbrewe.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import thomas.springframework.msscbrewe.web.model.BeerDto;

import java.util.UUID;

/**
 * @author vvthuy on 12/17/2020
 * @project mssc-brewery
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Thomas")
                .beerStyle("Nam")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .upc(beerDto.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo impl - would
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }


}
