package com.micro.controller;

import com.micro.entity.StockPriceDtls;
import com.micro.repo.StockPriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StockPriceController {
    @Autowired
    private StockPriceRepo stockPriceRepo;

    @GetMapping("/price/{companyName}")
    public ResponseEntity<StockPriceDtls> getStockPrice(@PathVariable String companyName) {
        StockPriceDtls stockPriceObj = stockPriceRepo.findByCompanyName(companyName);
        Double companyPrice = stockPriceObj.getCompanyPrice();
        return new ResponseEntity<StockPriceDtls>(stockPriceObj, HttpStatus.OK);
    }

}
