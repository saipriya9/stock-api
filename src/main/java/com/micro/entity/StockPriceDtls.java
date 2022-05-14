package com.micro.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "STOCK_PRICE")
public class StockPriceDtls {
    @Id
    @Column(name = "STOCK_ID")
    private int stockItd;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "COMPANY_PRICE")
    private double companyPrice;


    public int getStockItd() {
        return stockItd;
    }

    public void setStockItd(int stockItd) {
        this.stockItd = stockItd;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCompanyPrice() {
        return companyPrice;
    }

    public void setCompanyPrice(double companyPrice) {
        this.companyPrice = companyPrice;
    }


}
