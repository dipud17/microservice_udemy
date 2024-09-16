package com.springboot.microservices.accounts.service;


import com.springboot.microservices.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);



}
