package com.studentcrud.springbootstudentcrud.repository;

import com.studentcrud.springbootstudentcrud.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
