package com.aviabooking.DB_filling;

import com.aviabooking.DAO.OrderDAO;
import com.aviabooking.entity.OrderEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vataga on 01.10.2015.
 */
public class OrderFill implements OrderDAO {
    @Override
    public void addOrder(OrderEntity user) throws SQLException {

    }

    @Override
    public void updateOrder(OrderEntity user) throws SQLException {

    }

    @Override
    public OrderEntity getOrderById(Long id) throws SQLException {
        return null;
    }

    @Override
    public List getAllOrders() throws SQLException {
        return null;
    }

    @Override
    public void deleteOrder(OrderEntity user) throws SQLException {

    }
}
