package thomas.springframework.msscbrewe.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thomas.springframework.msscbrewe.services.CustomerService;
import thomas.springframework.msscbrewe.web.model.Customer;

import java.util.UUID;

/**
 * @author vvthuy on 12/17/2020
 * @project mssc-brewery
 */
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody Customer customer) {
        Customer resultCustomer = customerService.createCustomer(customer);
        return new ResponseEntity(resultCustomer, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handlePut(@PathVariable("customerId") UUID customerId, Customer customer) {
        customerService.updateCustomer(customerId, customer);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    public void deleteCustomer(@PathVariable("customerId") UUID customerId) {
        customerService.deleteById(customerId);
    }
}
