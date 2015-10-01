package com.aviabooking.DAO;

import com.aviabooking.entity.RecurrenceEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by vataga on 01.10.2015.
 */
public interface RecurrenceDAO {
    public void addRecurrence(RecurrenceEntity user) throws SQLException;   //�������� ������ �����
    public void updateRecurrence(RecurrenceEntity user) throws SQLException;//�������� ������ �����
    public RecurrenceEntity getRecurrenceById(Long id) throws SQLException;    //�������� ������ ����� �� id
    public List getAllRecurrences() throws SQLException;              //�������� ��� ������� ������
    public void deleteRecurrence(RecurrenceEntity user) throws SQLException;//������� ������ �����
}
