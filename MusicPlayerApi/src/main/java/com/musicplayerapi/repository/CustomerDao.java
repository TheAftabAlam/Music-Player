package com.musicplayerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicplayerapi.entity.Customer;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	public Customer findByMobileNo(String mobileNo);

}
