package thomas.springframework.msscbrewe.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import thomas.springframework.msscbrewe.web.model.Customer;

import java.util.UUID;

/**
 * @author vvthuy on 12/17/2020
 * @project mssc-brewery
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder()
                .id(customerId)
                .name("Thomas")
                .build();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .name(customer.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, Customer customer) {
        // TODO update Customer
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting Customer...");
    }


}
