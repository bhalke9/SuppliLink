package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJdbc  implements WarehouseService{

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
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteWarehouse(int warehouseId) {
        // TODO Auto-generated method stub
        //WarehouseService.super.deleteWarehouse(warehouseId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        //WarehouseService.super.emptyArrayList();
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) {
        // TODO Auto-generated method stub
        //return WarehouseService.super.getWarehouseById(warehouseId);
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
        // TODO Auto-generated method stub
        //return WarehouseService.super.getWarehouseBySupplier(supplierId);
        return null;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        //WarehouseService.super.updateWarehouse(warehouse);
    }
    


}