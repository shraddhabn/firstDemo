package com.ojas.Poc2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ojas.Poc2.Domain.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {

}
