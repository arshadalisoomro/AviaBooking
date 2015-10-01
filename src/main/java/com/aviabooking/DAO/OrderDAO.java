package com.aviabooking.DAO;

import com.aviabooking.entity.OrderEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vataga on 01.10.2015.
 */
public interface OrderDAO {
    public void addOrder(OrderEntity user) throws SQLException;   //добавить заказ
    public void updateOrder(OrderEntity user) throws SQLException;//обновить заказ
    public OrderEntity getOrderById(Long id) throws SQLException;    //получить заказ по id
    public List getAllOrders() throws SQLException;              //получить все заказы
    public void deleteOrder(OrderEntity user) throws SQLException;//удалить заказ
}
