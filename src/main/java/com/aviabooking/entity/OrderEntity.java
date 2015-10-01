package com.aviabooking.entity;

import javax.persistence.*;

/**
 * Created by vataga on 25.09.2015.
 */
@Entity
@Table(name = "Order", schema = "public", catalog = "avia")
public class OrderEntity {
    private int orederId;
    private String typeOfOrder;

    @Id
    @Column(name = "order_id")
    public int getOrederId() {
        return orederId;
    }

    public void setOrederId(int orederId) {
        this.orederId = orederId;
    }

    @Basic
    @Column(name = "Type_of_order")
    public String getTypeOfOrder() {
        return typeOfOrder;
    }

    public void setTypeOfOrder(String typeOfOrder) {
        this.typeOfOrder = typeOfOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (orederId != that.orederId) return false;
        if (typeOfOrder != null ? !typeOfOrder.equals(that.typeOfOrder) : that.typeOfOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orederId;
        result = 31 * result + (typeOfOrder != null ? typeOfOrder.hashCode() : 0);
        return result;
    }
}
