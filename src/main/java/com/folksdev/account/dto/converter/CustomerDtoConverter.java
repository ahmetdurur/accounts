package com.folksdev.account.dto.converter;

import com.folksdev.account.dto.AccountCustomerDto;
import com.folksdev.account.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class CustomerDtoConverter {
    public AccountCustomerDto convertToAccountCustomer(Optional<Customer> from) {
        return from.map(f -> new AccountCustomerDto(f.getId(), f.getName(), f.getSurName())).orElse(null);
    }
}