package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJdbc  implements ProductService{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public int addProduct(Product product) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteProduct(int productId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Product> getAllProductByWarehouse(int warehouseId) {
        // TODO Auto-generated method stub
        return ProductService.super.getAllProductByWarehouse(warehouseId);
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product getProductById(int productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateProduct(Product product) {
        // TODO Auto-generated method stub
        
    }
    

}