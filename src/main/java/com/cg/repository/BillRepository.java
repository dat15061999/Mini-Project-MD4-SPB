package com.cg.repository;

import com.cg.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BillRepository extends JpaRepository<Bill,Long> {
    Optional<Bill> findBillByCustomer_Name(String name);
}
