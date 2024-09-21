package com.studentcrud.springbootstudentcrud.service;

import com.studentcrud.springbootstudentcrud.entity.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Address saveAddress(Address address); // Method to save an address
    Optional<Address> getAddressById(Long id); // Method to get an address by ID
    List<Address> getAllAddresses(); // Method to get all addresses
    void deleteAddress(Long id); // Method to delete an address by ID
}
