package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJdbc  implements SupplierService {
    private static List<Supplier> supplierList = new ArrayList<>();

     private SupplierDAO supplierDAO;

    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        return supplierDAO.addSupplier(supplier);
    }

    @Override
    public void deleteSupplier(int supplierId)  throws SQLException{
        supplierDAO.deleteSupplier(supplierId);
        
    }

    @Override
    public void emptyArrayList() throws SQLException{
        supplierList.clear();
       
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException{
        return supplierDAO.getAllSuppliers();
        // TODO Auto-generated method stub
       
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException {
        List<Supplier> sortedSuppliers = supplierDAO.getAllSuppliers();
        if (sortedSuppliers != null) {
            sortedSuppliers.sort(Comparator.comparing(Supplier::getSupplierName)); // Sort by supplier name
        }
        return sortedSuppliers;
        // TODO Auto-generated method stub
        
    }

    @Override
    public Supplier getSupplierById(int supplierId) throws SQLException {
        return supplierDAO.getSupplierById(supplierId);
    }

    @Override
    public void updateSupplier(Supplier supplier) throws SQLException{
        supplierDAO.updateSupplier(supplier);
    }
    

}