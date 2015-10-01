package com.aviabooking.DAO;

import java.sql.SQLException;
import java.util.List;

import com.aviabooking.entity.UserEntity;

/**
 * Created by vataga on 01.10.2015.
 */
public interface UserDAO {
    public void addUser(UserEntity user) throws SQLException;   //добавить пользователя
    public void updateUser(UserEntity user) throws SQLException;//обновить пользователя
    public UserEntity getUserById(Long id) throws SQLException;    //получить пользователя по id
    public List getAllUsers() throws SQLException;              //получить всех пользователей
    public void deleteUser(UserEntity user) throws SQLException;//удалить пользователя
}
