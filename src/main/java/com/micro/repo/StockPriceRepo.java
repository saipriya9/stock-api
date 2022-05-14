package com.micro.repo;

import com.micro.entity.StockPriceDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPriceRepo extends JpaRepository<StockPriceDtls, Integer> {
    public StockPriceDtls findByCompanyName(String companyName);
}
