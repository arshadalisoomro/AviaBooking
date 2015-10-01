package com.aviabooking.DAO;

import com.aviabooking.entity.OrderEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vataga on 01.10.2015.
 */
public interface OrderDAO {
    public void addOrder(OrderEntity user) throws SQLException;   //�������� �����
    public void updateOrder(OrderEntity user) throws SQLException;//�������� �����
    public OrderEntity getOrderById(Long id) throws SQLException;    //�������� ����� �� id
    public List getAllOrders() throws SQLException;              //�������� ��� ������
    public void deleteOrder(OrderEntity user) throws SQLException;//������� �����
}
