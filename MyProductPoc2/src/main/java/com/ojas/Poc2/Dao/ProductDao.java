package com.ojas.Poc2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ojas.Poc2.Domain.Products;

public interface ProductDao extends JpaRepository<Products, Integer>{

}
