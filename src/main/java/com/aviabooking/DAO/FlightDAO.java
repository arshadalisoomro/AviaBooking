package com.aviabooking.DAO;

import java.sql.SQLException;
import java.util.List;

import com.aviabooking.entity.FlightEntity;

/**
 * Created by vataga on 01.10.2015.
 */
public interface FlightDAO {
    public void addFlight(FlightEntity user) throws SQLException;   //добавить пользователя
    public void updateFlight(FlightEntity user) throws SQLException;//обновить пользователя
    public FlightEntity getFlightById(Long id) throws SQLException;    //получить пользователя по id
    public List getAllFlights() throws SQLException;              //получить всех пользователей
    public void deleteFlight(FlightEntity user) throws SQLException;//удалить пользователя
}
