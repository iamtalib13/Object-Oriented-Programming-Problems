package com.bridgelabz.stockmanagement;

public class StockAccount {
    private String stockName;
    private int noOfShares;
    private double sharePrice;
    private double shareTotalValue;


    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public void setShareTotalValue(int noOfShares,double sharePrice) {
        shareTotalValue = noOfShares * sharePrice;
    }

    public double getShareTotalValue() {
        return this.shareTotalValue;
    }
}