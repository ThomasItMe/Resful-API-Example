package thomas.springframework.msscbrewe.services;

import thomas.springframework.msscbrewe.web.model.Customer;

import java.util.UUID;

/**
 * @author vvthuy on 12/17/2020
 * @project mssc-brewery
 */
public interface CustomerService {

    Customer getCustomerById(UUID customerId);

    Customer createCustomer(Customer customer);

    void updateCustomer(UUID customerId, Customer customer);

    void deleteById(UUID customerId);
}
