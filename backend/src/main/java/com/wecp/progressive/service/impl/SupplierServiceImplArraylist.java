package com.wecp.progressive.service.impl;

import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist  implements SupplierService{

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
    public int addSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteSupplier(int supplierId) {
        // TODO Auto-generated method stub
        SupplierService.super.deleteSupplier(supplierId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        SupplierService.super.emptyArrayList();
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        // TODO Auto-generated method stub
        //return SupplierService.super.getSupplierById(supplierId);
        return null;
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        //SupplierService.super.updateSupplier(supplier);
        
    }


}