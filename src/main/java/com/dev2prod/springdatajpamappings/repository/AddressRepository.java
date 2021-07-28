package com.dev2prod.springdatajpamappings.repository;

import com.dev2prod.springdatajpamappings.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
