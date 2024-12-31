package com.wecp.progressive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Product;

public class ProductDAOImpl implements ProductDAO{
    
    public int addProduct(Product product) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        int generatedID = -1;
        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "INSERT INTO product(warehouse_id,product_name,product_description,quantity,price) VALUES (?,?,?,?,?)";
            statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, product.getWarehouseId());
            statement.setString(2, product.getProductName());
            statement.setString(3,product.getProductDesc());
            statement.setInt(4,product.getQuantity());
            statement.setDouble(5, product.getPrice());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                generatedID = resultSet.getInt(1);
                product.setProductId(generatedID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
            // TODO: handle exception
        }
        finally{
            if(statement!=null){
                statement.close();
            }
        }
        return generatedID;
        
    }
    public Product getProductById(int productId) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "SELECT * FROM product WHERE product_id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, productId);
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                int warehouseId = resultSet.getInt("warehouse_id");
                String productName = resultSet.getString("product_name");
                String productDesc = resultSet.getString("product_description");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");
                return new Product(productId, warehouseId, productName, productDesc, quantity, price);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;


            // TODO: handle exception
        }
        finally{
            if(connection!=null){
                connection.close();
            }
        }
        return null;
    }
    public void updateProduct(Product product) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "UPDATE product SET warehouse_id=?,product_name=?,product_description=?,quantity=?,price=? WHERE product_id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, product.getWarehouseId());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getProductDesc());
            statement.setInt(4, product.getQuantity());
            statement.setDouble(5, product.getPrice());
            statement.setInt(6, product.getProductId());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
            // TODO: handle exception
        }
        finally{
            if(connection!=null){
                connection.close();
            }
        }


    }
    public void deleteProduct(int productId) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "DELETE FROM product WHERE product_id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, productId);
            statement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
        finally{
            if(connection!=null){
                connection.close();
            }
        }


    }
    public List<Product> getAllProducts() throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        // ResultSet resultSet = null;
        try {
            connection = DatabaseConnectionManager.getConnection();
            List<Product> products = new ArrayList<>();
            String sql = "SELECT * FROM product";
            statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                int warehouseId = resultSet.getInt("warehouse_id");
                String productName = resultSet.getString("product_name");
                String productDesc = resultSet.getString("product_description");
                int quantity = resultSet.getInt("quantity");
                Double price = resultSet.getDouble("price");
                products.add(new Product(productId, warehouseId, productName, productDesc, quantity, price));
            }
            return products;
        }
        catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
        finally{
            if(connection!=null){
                connection.close();
            }
        }                
    }

        

}



