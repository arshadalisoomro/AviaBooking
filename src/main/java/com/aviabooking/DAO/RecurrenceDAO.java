package com.aviabooking.DAO;

import com.aviabooking.entity.RecurrenceEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vataga on 01.10.2015.
 */
public interface RecurrenceDAO {
    public void addRecurrence(RecurrenceEntity user) throws SQLException;   //добавить повтор рейса
    public void updateRecurrence(RecurrenceEntity user) throws SQLException;//обновить повтор рейса
    public RecurrenceEntity getRecurrenceById(Long id) throws SQLException;    //получить повтор рейса по id
    public List getAllRecurrences() throws SQLException;              //получить все повторы рейсов
    public void deleteRecurrence(RecurrenceEntity user) throws SQLException;//удалить повтор рейса
}
