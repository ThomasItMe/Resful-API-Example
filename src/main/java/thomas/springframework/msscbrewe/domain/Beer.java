package thomas.springframework.msscbrewe.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import thomas.springframework.msscbrewe.web.model.v2.BeerStyleEnum;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author vvthuy on 12/25/2020
 * @project mssc-brewery
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

    private Timestamp createDate;
    private Timestamp lastUpdatedDate;
}
