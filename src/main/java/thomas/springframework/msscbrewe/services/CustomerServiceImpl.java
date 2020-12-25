package thomas.springframework.msscbrewe.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import thomas.springframework.msscbrewe.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author vvthuy on 12/17/2020
 * @project mssc-brewery
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("Thomas")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO update CustomerDto
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting CustomerDto...");
    }


}
