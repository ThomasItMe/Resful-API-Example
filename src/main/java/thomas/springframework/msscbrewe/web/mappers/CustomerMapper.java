package thomas.springframework.msscbrewe.web.mappers;

import org.mapstruct.Mapper;
import thomas.springframework.msscbrewe.domain.Customer;
import thomas.springframework.msscbrewe.web.model.CustomerDto;

/**
 * @author vvthuy on 12/25/2020
 * @project mssc-brewery
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
