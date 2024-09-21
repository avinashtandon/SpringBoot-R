package com.studentcrud.springbootstudentcrud.service;

import com.studentcrud.springbootstudentcrud.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentcrud.springbootstudentcrud.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address); // Saves the address to the database
    }

    @Override
    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id); // Retrieves the address by ID
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll(); // Retrieves all addresses
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id); // Deletes the address by ID
    }
}
