package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJdbc  implements SupplierService {
    private static List<Supplier> supplierList = new ArrayList<>();

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
        supplierList.add(supplier);
        return 0;
    }

    @Override
    public void deleteSupplier(int supplierId) {
        // TODO Auto-generated method stub
        //SupplierService.super.deleteSupplier(supplierId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        SupplierService.super.emptyArrayList();
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return supplierList;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        List<Supplier> sortedSupplir = supplierList;
        sortedSupplir.sort(Comparator.comparing(Supplier::getSupplierName));
        return sortedSupplir;
        // TODO Auto-generated method stub
        
    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        // TODO Auto-generated method stub
        return SupplierService.super.getSupplierById(supplierId);
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        SupplierService.super.updateSupplier(supplier);
    }
    

}