package thomas.springframework.msscbrewe.web.mappers;

import org.mapstruct.Mapper;
import thomas.springframework.msscbrewe.domain.Beer;
import thomas.springframework.msscbrewe.web.model.BeerDto;

/**
 * @author vvthuy on 12/25/2020
 * @project mssc-brewery
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
