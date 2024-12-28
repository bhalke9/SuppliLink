package com.wecp.progressive.entity;

public class Product {
    
    private int productId;
    private String productName;
    private String productDesc;
    private int quantity;
    private double price;

    public Product(int productId, String productName, String productDesc, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.quantity = quantity;
        this.price = price;
    }
    public Product(){}
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductDesc() {
        return productDesc;
    }
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
    

}